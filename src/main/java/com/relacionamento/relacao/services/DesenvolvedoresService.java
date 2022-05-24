package com.relacionamento.relacao.services;

import java.util.List;

import com.relacionamento.relacao.model.Desenvolvedores;
import com.relacionamento.relacao.repository.DesenvolvedorRepository;

import org.springframework.stereotype.Service;

@Service
public class DesenvolvedoresService {

    DesenvolvedorRepository repository;

    public List<Desenvolvedores> getDesenvolvedores() {
        return repository.findAll();
    }

    public void buscaId(Desenvolvedores id) {
        repository.findAll();
    }

    public void insereDev(Desenvolvedores desenvolvedores) {

        this.repository.save(desenvolvedores);

    }

    public void atualizaDev(Desenvolvedores desenvolvedores) {
        repository.save(desenvolvedores);

    }

    public void deleteDev(Desenvolvedores desenvolvedores) {
        repository.delete(desenvolvedores);
    }
}
