package com.relacionamento.relacao.repository;

import com.relacionamento.relacao.model.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioRepository  extends JpaRepository<Integer,Funcionario>{
    

}
