package com.relacionamento.relacao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Desenvolvedores {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private double salario;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "PROJETO_FUNCIONARIO",
        joinColumns = {@JoinColumn(name = "FUNCIONARIO_ID")},
        inverseJoinColumns = {@JoinColumn(name = "PROJETO_ID")}
    )
    private List<Startup> projetos;
}
