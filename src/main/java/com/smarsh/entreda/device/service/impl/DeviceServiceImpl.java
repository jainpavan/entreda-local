package com.smarsh.entreda.device.service.impl;

import com.smarsh.entreda.device.cyberrepo.DeviceCyberRepository;
import com.smarsh.entreda.device.dto.DeviceDto;
import com.smarsh.entreda.device.service.DeviceService;
import com.smarsh.entreda.cyberheader.CyberHeaders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final DeviceCyberRepository deviceCyberRepository;

    @Override
    public DeviceDto getDevice(CyberHeaders cyberHeaders, String deviceId) {
        // TODO fetch db connection string and establish db connection with tenant db
        return deviceCyberRepository.getDeviceById(deviceId);
    }

    @Override
    public DeviceDto createDevice(CyberHeaders cyberHeaders, DeviceDto deviceDto) {
        return deviceCyberRepository.addDevice(deviceDto);
    }

    @Override
    public DeviceDto updateDevice(CyberHeaders cyberHeaders, String deviceId) {
        return null;
    }

    @Override
    public void deleteDevice(CyberHeaders cyberHeaders, String deviceId) {

    }

    @Override
    public List<DeviceDto> getAllDevices(CyberHeaders cyberHeaders) {
        return deviceCyberRepository.getAllDevices();
    }
}
