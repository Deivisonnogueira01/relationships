package com.relacionamento.relacao.services;

import java.util.List;

import com.relacionamento.relacao.model.Gratificacoes;
import com.relacionamento.relacao.repository.GratificacoesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GratificacoesService {
 
  @Autowired
  private  GratificacoesRepository repository;

   public List<Gratificacoes> premiosDev(){

       return  repository.findAll();
        
   }



     

}
