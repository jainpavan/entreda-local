package com.smarsh.entreda.response;

import lombok.Data;

@Data
public class PaginatedResponse {
    private int pageIndex;
    private int pageSize;
    private int total;
}
