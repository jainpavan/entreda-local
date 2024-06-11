package com.smarsh.entreda.cyberheader;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CyberHeaders {
    private String applianceId;
    private String tenantId;
}
