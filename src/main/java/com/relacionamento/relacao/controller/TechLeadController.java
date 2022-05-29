package com.relacionamento.relacao.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.relacionamento.relacao.model.TechLead;
import com.relacionamento.relacao.services.TechLeadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/tech-lead")
public class TechLeadController {
   
   @Autowired 
  private TechLeadService service;


  @GetMapping("/newtl")
  public ModelAndView novoTech(){

    ModelAndView mv = new ModelAndView("tech");
    TechLead tl = new TechLead();
    mv.addObject("tlObj", tl);
    return mv;
  }

  @GetMapping("listar-techs")
   public ModelAndView listarTech(){
   ModelAndView mv = new ModelAndView("listaDeTechs");
  List<TechLead> listTech = this.service.identificaTech();
  mv.addObject("TechObj", listTech);
  return mv;
   }

}
