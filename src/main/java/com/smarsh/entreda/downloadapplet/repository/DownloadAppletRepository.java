package com.smarsh.entreda.downloadapplet.repository;

import com.smarsh.entreda.downloadapplet.entity.DownloadApplet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DownloadAppletRepository extends JpaRepository<DownloadApplet, String> {
}
