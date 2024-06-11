package com.smarsh.entreda.sat.service.impl;

import com.smarsh.entreda.sat.dto.SATDto;
import com.smarsh.entreda.sat.repository.SATRepository;
import com.smarsh.entreda.sat.service.SATService;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SATServiceImpl implements SATService {

    private final SATRepository satRepository;

    private final ObjectMapper objectMapper;

    @Override
    public List<SATDto> getAllSAT() {
        return List.of();
    }

    @Override
    public SATDto getSATById(int id) {
        return null;
    }

    @Override
    public SATDto saveSAT(SATDto sat) {
        return null;
    }

    @Override
    public SATDto updateSAT(SATDto sat) {
        return null;
    }

    @Override
    public void deleteSAT(int id) {

    }
}
