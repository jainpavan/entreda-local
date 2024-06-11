package com.smarsh.entreda.factors.service;


import com.smarsh.entreda.factors.dto.FactorDto;

import java.util.List;

public interface FactorService {
    List<FactorDto> getAllFactor();
    FactorDto getFactorById(int id);
    FactorDto createFactor(FactorDto factorDto);
    FactorDto updateFactor(FactorDto factorDto);
    void deleteFactor(int id);
}
