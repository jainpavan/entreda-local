package com.smarsh.entreda.phishing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Phishing {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
