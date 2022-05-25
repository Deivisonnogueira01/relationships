package com.relacionamento.relacao.services;

import java.util.List;

import com.relacionamento.relacao.model.Endereço;
import com.relacionamento.relacao.repository.EndereçoRepository;

import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    
    EndereçoRepository repository;

    public List<Endereço> getEndereços() {
        return repository.findAll();
    }

    public void buscaIdEndereco(Endereço id) {
        repository.findAll();
    }

    public void atualizaEndereco(Endereço endereco) {
        repository.save(endereco);

    }

    public void enderecoDev(Endereço endereco) {
        repository.delete(endereco);
    }

}
