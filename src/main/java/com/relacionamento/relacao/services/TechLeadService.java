package com.relacionamento.relacao.services;

import com.relacionamento.relacao.model.TechLead;
import com.relacionamento.relacao.repository.TechLeadRepository;

import org.springframework.stereotype.Service;

@Service
public class TechLeadService {
    
    TechLeadRepository repository;

    public void identificaTech(TechLead tech){
        repository.findAll();
    }

    public void insereTech(TechLead tech){
        repository.save(tech);
    }

    public void AtualizaTech(TechLead tech){
        repository.save(tech);
    }

    public void deleteTech(TechLead tech){
        repository.delete(tech);
    }
}

