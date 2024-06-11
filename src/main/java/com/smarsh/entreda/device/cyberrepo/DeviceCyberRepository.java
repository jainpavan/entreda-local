package com.smarsh.entreda.device.cyberrepo;

import com.smarsh.entreda.device.dto.DeviceDto;
import com.smarsh.entreda.device.entity.Device;
import com.smarsh.entreda.device.repository.DeviceRepository;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DeviceCyberRepository {

    private final DeviceRepository deviceRepository;

    private final ObjectMapper objectMapper;

    public List<DeviceDto> getAllDevices() {
        List<Device> allDevices = deviceRepository.findAll();
        List<DeviceDto> listDeviceDto = new ArrayList<>();
        for (Device device : allDevices) {
            listDeviceDto.add( (DeviceDto) objectMapper.copyObject(device, DeviceDto.class));
        }
        return listDeviceDto;
    }

    public DeviceDto getDeviceById(String deviceId) {
        Device deviceById = deviceRepository.getDeviceById(Long.valueOf(deviceId));
        return (DeviceDto) objectMapper.copyObject(deviceById, DeviceDto.class);
    }

    public DeviceDto addDevice(DeviceDto deviceDto) {
        Device device = (Device) objectMapper.copyObject(deviceDto, Device.class);
        Device savedObject = deviceRepository.save(device);
        return (DeviceDto) objectMapper.copyObject(savedObject, DeviceDto.class);
    }

}
