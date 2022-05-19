package com.relacionamento.relacao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Projeto {
    
    @Id
    private int id;

   private String name;

   private double custoTotal;

   private int duracao;

   @ManyToMany
   private List<Funcionario> funncionarios;
}
