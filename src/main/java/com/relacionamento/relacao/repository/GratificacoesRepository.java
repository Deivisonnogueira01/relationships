package com.relacionamento.relacao.repository;

import com.relacionamento.relacao.model.Gratificacoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GratificacoesRepository extends JpaRepository<Gratificacoes, Integer>{


}
