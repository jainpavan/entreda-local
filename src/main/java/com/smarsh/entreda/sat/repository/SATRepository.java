package com.smarsh.entreda.sat.repository;

import com.smarsh.entreda.sat.entity.SAT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SATRepository extends JpaRepository<SAT, String> {
}
