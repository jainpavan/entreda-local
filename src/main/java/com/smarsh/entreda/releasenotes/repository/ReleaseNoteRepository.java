package com.smarsh.entreda.releasenotes.repository;

import com.smarsh.entreda.releasenotes.entity.ReleaseNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseNoteRepository extends JpaRepository<ReleaseNote, String> {
}
