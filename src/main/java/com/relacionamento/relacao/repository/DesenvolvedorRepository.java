package com.relacionamento.relacao.repository;

import com.relacionamento.relacao.model.Desenvolvedores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesenvolvedorRepository  extends JpaRepository<Desenvolvedores,Integer>{
    

    
}
