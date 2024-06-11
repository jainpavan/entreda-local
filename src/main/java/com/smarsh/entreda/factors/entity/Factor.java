package com.smarsh.entreda.factors.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Factor {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
