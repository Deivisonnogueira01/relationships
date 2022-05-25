package com.relacionamento.relacao.repository;

import com.relacionamento.relacao.model.Endereço;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndereçoRepository  extends JpaRepository<Endereço, Integer>{
    
    
}
