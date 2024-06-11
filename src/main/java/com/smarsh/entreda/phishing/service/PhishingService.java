package com.smarsh.entreda.phishing.service;


import com.smarsh.entreda.phishing.dto.PhishingDto;

import java.util.List;

public interface PhishingService {
    List<PhishingDto> getAllPhishing();
    PhishingDto getPhishingById(int id);
    PhishingDto createPhishing(PhishingDto phishingDto);
    PhishingDto updatePhishing(PhishingDto phishingDto);
    void deletePhishing(int id);
}
