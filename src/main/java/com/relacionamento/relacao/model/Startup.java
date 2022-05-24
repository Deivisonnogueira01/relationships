package com.relacionamento.relacao.model;

import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Startup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStartup;

    private String nameStartup;

    private double custoTotal;

    private int duracao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "DESENVOLVEDORES_STARTUP", joinColumns = { @JoinColumn(name = "STARTUP_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "DESENVOLVEDORES_ID") })
    private List<Desenvolvedores> funcionarios;
}
