package com.relacionamento.relacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Gratificacoes {

    @Id
   private Integer numGratificacao;
   
   private String tipoGratificacao;

   @ManyToOne
   private Desenvolvedores desenvolvedores;
}