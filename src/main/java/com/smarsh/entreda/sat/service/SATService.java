package com.smarsh.entreda.sat.service;

import com.smarsh.entreda.sat.dto.SATDto;

import java.util.List;

public interface SATService {
    List<SATDto> getAllSAT();
    SATDto getSATById(int id);
    SATDto saveSAT(SATDto sat);
    SATDto updateSAT(SATDto sat);
    void deleteSAT(int id);
}
