package com.smarsh.entreda.device.controller;

import com.smarsh.entreda.constant.AppConstants;
import com.smarsh.entreda.constant.ErrorResponse;
import com.smarsh.entreda.constant.SuccessResponse;
import com.smarsh.entreda.device.dto.DeviceDto;
import com.smarsh.entreda.device.request.DeviceRequest;
import com.smarsh.entreda.device.response.DeviceResponse;
import com.smarsh.entreda.device.service.DeviceService;
import com.smarsh.entreda.exception.InvalidDataException;
import com.smarsh.entreda.handler.ResponseHandler;
import com.smarsh.entreda.cyberheader.CyberHeaders;
import com.smarsh.entreda.mapper.ObjectMapper;
import com.smarsh.entreda.validator.HeaderValidator;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/device")
@Tag(name = "Device",
        description = "Endpoint to provide Device information"
)
public class DeviceController {
    private static final Logger log = LoggerFactory.getLogger(DeviceController.class);

    private final DeviceService deviceService;

    private final ObjectMapper objectMapper;

    private final HeaderValidator headerValidator;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "1200", description = AppConstants.SUCCESS, content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))}),
            @ApiResponse(responseCode = "1404", description = "Device not found"),
            @ApiResponse(responseCode = "1500", description = "Internal server error", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))})})
    @GetMapping("")
    public ResponseEntity<?> getAllDevices(@RequestHeader("X-TenantID") String tenantId,
                                           @RequestHeader("X-ApplianceID") String applianceId) {

        if (headerValidator.isApplianceIdValid(applianceId)
                && headerValidator.isTenantIdValid(tenantId)) {
            CyberHeaders cyberHeaders = CyberHeaders.builder()
                    .applianceId(applianceId)
                    .tenantId(tenantId).build();
            List<DeviceDto> allDevices = deviceService.getAllDevices(cyberHeaders);
            return new ResponseEntity<Object>(
                    ResponseHandler.builder().status(AppConstants.SUCCESS)
                            .message(SuccessResponse.DEVICE_RETURNED_SUCCESSFULLY.getMessage())
                            .error(null)
                            .cyberCode(AppConstants.STATUS_OK)
                            .data(allDevices).build(), HttpStatus.OK);
        } else {
            throw new InvalidDataException(ErrorResponse.INVALID_HEADER.getMessage());
        }
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "1200", description = AppConstants.SUCCESS, content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))}),
            @ApiResponse(responseCode = "1400", description = "Invalid DeviceId supplied"),
            @ApiResponse(responseCode = "1404", description = "Device not found"),
            @ApiResponse(responseCode = "1500", description = "Internal server error", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))})})
    @GetMapping("/{deviceId}")
    public ResponseEntity<?> getDeviceById(@RequestHeader("X-TenantID") String tenantId,
                                           @RequestHeader("X-ApplianceID") String applianceId,
                                           @Valid @PathVariable("deviceId") String deviceId) {
        if (headerValidator.isApplianceIdValid(applianceId)
                && headerValidator.isTenantIdValid(tenantId)) {
            CyberHeaders cyberHeaders = CyberHeaders.builder()
                    .applianceId(applianceId)
                    .tenantId(tenantId).build();
            DeviceDto device = deviceService.getDevice(cyberHeaders, deviceId);
            DeviceResponse response = (DeviceResponse) objectMapper.copyObject(device, DeviceResponse.class);
            return new ResponseEntity<Object>(
                    ResponseHandler.builder().status(AppConstants.SUCCESS)
                            .message(SuccessResponse.DEVICE_RETURNED_SUCCESSFULLY.getMessage())
                            .error(null)
                            .cyberCode(AppConstants.STATUS_OK)
                            .data(response).build(), HttpStatus.OK);
        } else {
            throw new InvalidDataException(ErrorResponse.INVALID_HEADER.getMessage());
        }
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "1201", description = AppConstants.SUCCESS, content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))}),
            @ApiResponse(responseCode = "1500", description = "Internal server error", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))})})
    @PostMapping("")
    public ResponseEntity<?> saveDevice(@Valid @RequestBody DeviceRequest request,
                                        @RequestHeader("X-TenantID") String tenantId,
                                        @RequestHeader("X-ApplianceID") String applianceId) {
        if (headerValidator.isApplianceIdValid(applianceId)
                && headerValidator.isTenantIdValid(tenantId)) {
            CyberHeaders cyberHeaders = CyberHeaders.builder()
                    .applianceId(applianceId)
                    .tenantId(tenantId).build();
            DeviceDto deviceDto = (DeviceDto) objectMapper.copyObject(request, DeviceDto.class);
            DeviceDto device = deviceService.createDevice(cyberHeaders, deviceDto);
            DeviceResponse response = (DeviceResponse) objectMapper.copyObject(device, DeviceResponse.class);
            return new ResponseEntity<Object>(
                    ResponseHandler.builder().status(AppConstants.SUCCESS)
                            .message(SuccessResponse.DEVICE_CREATED_SUCCESSFULLY.getMessage())
                            .error(null)
                            .cyberCode(AppConstants.STATUS_CREATED)
                            .data(response).build(), HttpStatus.CREATED);
        } else {
            throw new InvalidDataException(ErrorResponse.INVALID_HEADER.getMessage());
        }
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "1200", description = AppConstants.SUCCESS, content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))}),
            @ApiResponse(responseCode = "1500", description = "Internal server error", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))})})

    @PutMapping("/{deviceId}")
    public ResponseEntity<?> updateDevice(@RequestHeader("X-TenantID") String tenantId,
                                          @RequestHeader("X-ApplianceID") String applianceId,
                                          @PathVariable String deviceId) {
        if (headerValidator.isApplianceIdValid(applianceId)
                && headerValidator.isTenantIdValid(tenantId)) {
            CyberHeaders cyberHeaders = CyberHeaders.builder()
                    .applianceId(applianceId)
                    .tenantId(tenantId).build();
            DeviceDto device = deviceService.updateDevice(cyberHeaders, deviceId);
            DeviceResponse response = (DeviceResponse) objectMapper.copyObject(device, DeviceResponse.class);
            return new ResponseEntity<Object>(
                    ResponseHandler.builder().status(AppConstants.SUCCESS)
                            .message(SuccessResponse.DEVICE_UPDATED_SUCCESSFULLY.getMessage())
                            .error(null)
                            .cyberCode(AppConstants.STATUS_OK)
                            .data(response).build(), HttpStatus.OK);
        } else {
            throw new InvalidDataException(ErrorResponse.INVALID_HEADER.getMessage());
        }
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "1200", description = AppConstants.SUCCESS, content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))}),
            @ApiResponse(responseCode = "1500", description = "Internal server error", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ResponseHandler.class))})})

    @DeleteMapping("/{deviceId}")
    public ResponseEntity<?> deleteDevice(@RequestHeader("X-TenantID") String tenantId,
                                          @RequestHeader("X-ApplianceID") String applianceId,
                                          @PathVariable String deviceId) {
        if (headerValidator.isApplianceIdValid(applianceId)
                && headerValidator.isTenantIdValid(tenantId)) {
            CyberHeaders cyberHeaders = CyberHeaders.builder()
                    .applianceId(applianceId)
                    .tenantId(tenantId).build();
            deviceService.deleteDevice(cyberHeaders, deviceId);
            return new ResponseEntity<Object>(
                    ResponseHandler.builder().status(AppConstants.SUCCESS)
                            .message(SuccessResponse.DEVICE_DELETED_SUCCESSFULLY.getMessage())
                            .error(null)
                            .cyberCode(AppConstants.STATUS_OK)
                            .data(SuccessResponse.DEVICE_DELETED_SUCCESSFULLY).build(), HttpStatus.OK);
        } else {
            throw new InvalidDataException(ErrorResponse.INVALID_HEADER.getMessage());
        }
    }
}
