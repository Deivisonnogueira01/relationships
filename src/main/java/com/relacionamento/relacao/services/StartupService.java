package com.relacionamento.relacao.services;

import java.util.List;

import com.relacionamento.relacao.model.Startup;
import com.relacionamento.relacao.repository.StartupRepository;

import org.springframework.stereotype.Service;

@Service
public class StartupService {
    
     StartupRepository repository;
     
     public List<Startup> buscaStartup(){
         return repository.findAll();

     }

     public void insereStartup(Startup startup){
         repository.save(startup);

    }

    public void atualizaStartup(Startup update){
          repository.save(update);
    }

    public void deleteStartup(Startup deleteStartup){
        repository.delete(deleteStartup);
    }

}
