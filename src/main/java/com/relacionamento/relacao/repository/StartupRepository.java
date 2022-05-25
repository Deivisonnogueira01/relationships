package com.relacionamento.relacao.repository;

import com.relacionamento.relacao.model.Startup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartupRepository  extends JpaRepository<Startup, Integer> {
    
    
}
