package com.smarsh.entreda.device.repository;

import com.smarsh.entreda.device.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeviceRepository extends JpaRepository<Device, String> {
    Device getDeviceById(Long id);
}
