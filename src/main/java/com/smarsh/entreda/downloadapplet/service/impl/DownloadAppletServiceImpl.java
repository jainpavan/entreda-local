package com.smarsh.entreda.downloadapplet.service.impl;

import com.smarsh.entreda.downloadapplet.dto.DownloadAppletDto;
import com.smarsh.entreda.downloadapplet.repository.DownloadAppletRepository;
import com.smarsh.entreda.downloadapplet.service.DownloadAppletService;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DownloadAppletServiceImpl implements DownloadAppletService {

    private final DownloadAppletRepository downloadAppletRepository;

    private final ObjectMapper objectMapper;


    @Override
    public List<DownloadAppletDto> getAllDownloadApplet() {
        return List.of();
    }

    @Override
    public DownloadAppletDto updateDownloadApplet(DownloadAppletDto dto) {
        return null;
    }

    @Override
    public DownloadAppletDto createDownloadApplet(DownloadAppletDto dto) {
        return null;
    }

    @Override
    public DownloadAppletDto deleteDownloadApplet(DownloadAppletDto dto) {
        return null;
    }

    @Override
    public DownloadAppletDto getDownloadAppletById(int id) {
        return null;
    }
}
