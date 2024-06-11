package com.smarsh.entreda.phishing.service.impl;

import com.smarsh.entreda.phishing.dto.PhishingDto;
import com.smarsh.entreda.phishing.repository.PhishingRepository;
import com.smarsh.entreda.phishing.service.PhishingService;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhishingServiceImpl implements PhishingService {

    private final PhishingRepository phishingRepository;

    private final ObjectMapper objectMapper;

    @Override
    public List<PhishingDto> getAllPhishing() {
        return List.of();
    }

    @Override
    public PhishingDto getPhishingById(int id) {
        return null;
    }

    @Override
    public PhishingDto createPhishing(PhishingDto phishingDto) {
        return null;
    }

    @Override
    public PhishingDto updatePhishing(PhishingDto phishingDto) {
        return null;
    }

    @Override
    public void deletePhishing(int id) {

    }
}
