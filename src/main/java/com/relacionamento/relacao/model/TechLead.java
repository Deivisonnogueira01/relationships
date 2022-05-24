package com.relacionamento.relacao.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechLead {
    
  private Integer idTech;

  private String nameTech;

}
