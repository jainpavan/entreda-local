package com.smarsh.entreda.releasenotes.service.impl;

import com.smarsh.entreda.releasenotes.dto.ReleaseNoteDto;
import com.smarsh.entreda.releasenotes.repository.ReleaseNoteRepository;
import com.smarsh.entreda.releasenotes.service.ReleaseNoteService;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReleaseNoteServiceImpl implements ReleaseNoteService {

    private final ReleaseNoteRepository releaseNoteRepository;

    private final ObjectMapper objectMapper;

    @Override
    public List<ReleaseNoteDto> getAllReleaseNotes() {
        return List.of();
    }

    @Override
    public ReleaseNoteDto getReleaseNoteById(int id) {
        return null;
    }
}
