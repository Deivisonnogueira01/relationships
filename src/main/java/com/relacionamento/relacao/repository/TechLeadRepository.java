package com.relacionamento.relacao.repository;

import com.relacionamento.relacao.model.TechLead;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechLeadRepository extends JpaRepository<TechLead, Integer> {
    
    
}
