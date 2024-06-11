package com.smarsh.entreda.device.service;


import com.smarsh.entreda.device.dto.DeviceDto;
import com.smarsh.entreda.cyberheader.CyberHeaders;

import java.util.List;

public interface DeviceService {
    DeviceDto getDevice(CyberHeaders cyberHeaders, String deviceId);
    DeviceDto createDevice(CyberHeaders cyberHeaders, DeviceDto request);
    DeviceDto updateDevice(CyberHeaders cyberHeaders, String deviceId);
    void deleteDevice(CyberHeaders cyberHeaders, String deviceId);
    List<DeviceDto> getAllDevices(CyberHeaders cyberHeaders);
}
