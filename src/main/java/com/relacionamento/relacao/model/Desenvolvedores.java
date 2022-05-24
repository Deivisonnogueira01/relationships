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
    private String especializacao;
    

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "STARTUP_DEV",
        joinColumns = {@JoinColumn(name = "DESENVOLVEDOR_ID")},
        inverseJoinColumns = {@JoinColumn(name = "STARTUP_ID")}
    )
    private List<Startup>  startups;
}
