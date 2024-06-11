package com.smarsh.entreda.downloadapplet.service;


import com.smarsh.entreda.downloadapplet.dto.DownloadAppletDto;

import java.util.List;

public interface DownloadAppletService {
    List<DownloadAppletDto> getAllDownloadApplet();
    DownloadAppletDto updateDownloadApplet(DownloadAppletDto dto);
    DownloadAppletDto createDownloadApplet(DownloadAppletDto dto);
    DownloadAppletDto deleteDownloadApplet(DownloadAppletDto dto);
    DownloadAppletDto getDownloadAppletById(int id);

}
