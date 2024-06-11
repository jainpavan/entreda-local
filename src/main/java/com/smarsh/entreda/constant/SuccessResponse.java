package com.smarsh.entreda.constant;

import lombok.Getter;

@Getter
public enum SuccessResponse {

    DEVICE_RETURNED_SUCCESSFULLY("Device returned successfully"),
    DEVICE_CREATED_SUCCESSFULLY("Device created successfully"),
    DEVICE_UPDATED_SUCCESSFULLY("Device updated successfully"),
    DEVICE_DELETED_SUCCESSFULLY("Device deleted successfully");

    private String message;

    SuccessResponse(String message) {
        this.message = message;
    }

}
