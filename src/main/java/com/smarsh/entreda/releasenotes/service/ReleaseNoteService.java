package com.smarsh.entreda.releasenotes.service;


import com.smarsh.entreda.releasenotes.dto.ReleaseNoteDto;

import java.util.List;

public interface ReleaseNoteService {
    List<ReleaseNoteDto> getAllReleaseNotes();
    ReleaseNoteDto getReleaseNoteById(int id);
//    ReleaseNoteDto createReleaseNote(ReleaseNoteDto releaseNoteDto);
//    ReleaseNoteDto updateReleaseNote(ReleaseNoteDto releaseNoteDto);
//    void deleteReleaseNote(int id);
}
