package com.relacionamento.relacao.services;

import com.relacionamento.relacao.model.Desenvolvedores;
import com.relacionamento.relacao.repository.DesenvolvedorRepository;

import org.springframework.stereotype.Service;

@Service
public class DesenvolvedoresService {
    
     DesenvolvedorRepository repository;

    public void buscaId(Desenvolvedores id ) {
            repository.findAll(); 
    }

    public void insereDev(Desenvolvedores desenvolvedores ){
            repository.save(desenvolvedores);
            
    }

    public void atualizaDev(Desenvolvedores desenvolvedores){
         repository.save(desenvolvedores);

    }

    public void deleteDev(Desenvolvedores desenvolvedores){
         repository.delete(desenvolvedores);
    }
}
