package com.smarsh.entreda.factors.repository;

import com.smarsh.entreda.factors.entity.Factor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactorRepository extends JpaRepository<Factor, String> {
}
