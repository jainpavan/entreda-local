package com.smarsh.entreda.device.request;

import com.smarsh.entreda.request.PaginatedRequest;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DeviceRequest extends PaginatedRequest {

//    @NotEmpty(message = "DeviceId can not be empty.")
//    @Size(min = 3, message = "Invalid deviceId: Must be of 3 characters")
//    private String deviceId;
    private String deviceName;
}
