package com.smarsh.entreda.request;


import lombok.Data;

@Data
public class PaginatedRequest {
    private int pageIndex;
    private int pageSize;
}
