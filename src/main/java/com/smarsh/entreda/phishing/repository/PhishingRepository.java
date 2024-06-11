package com.smarsh.entreda.phishing.repository;

import com.smarsh.entreda.phishing.entity.Phishing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhishingRepository extends JpaRepository<Phishing, String> {
}
