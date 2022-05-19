package com.relacionamento.relacao.model;

import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "FUNCIONARIO_PROJETO", joinColumns = { @JoinColumn(name = "PROJETO_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "FUNCIONARIO_ID") })
    private List<Funcionario> funcionarios;
}
