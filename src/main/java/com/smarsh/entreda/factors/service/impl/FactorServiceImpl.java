package com.smarsh.entreda.factors.service.impl;

import com.smarsh.entreda.factors.dto.FactorDto;
import com.smarsh.entreda.factors.repository.FactorRepository;
import com.smarsh.entreda.factors.service.FactorService;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FactorServiceImpl implements FactorService {

    private final FactorRepository factorRepository;

    private final ObjectMapper objectMapper;

    @Override
    public List<FactorDto> getAllFactor() {
        return List.of();
    }

    @Override
    public FactorDto getFactorById(int id) {
        return null;
    }

    @Override
    public FactorDto createFactor(FactorDto factorDto) {
        return null;
    }

    @Override
    public FactorDto updateFactor(FactorDto factorDto) {
        return null;
    }

    @Override
    public void deleteFactor(int id) {

    }
}
