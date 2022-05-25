package com.relacionamento.relacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereço {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  Integer codIndemtificador;
     private String rua;
     private String bairro;
     private String cep;
     private String cidade;
     private String estado;
}
