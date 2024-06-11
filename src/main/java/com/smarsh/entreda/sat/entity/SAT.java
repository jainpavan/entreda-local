package com.smarsh.entreda.sat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SAT {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
