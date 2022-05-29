package com.relacionamento.relacao.controller;

import java.util.List;

import com.relacionamento.relacao.model.Gratificacoes;
import com.relacionamento.relacao.services.GratificacoesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("gratificacoes")
public class GratificacacoesController {

    @Autowired
    private GratificacoesService service;

    @GetMapping("/new-grat")
    public ModelAndView novoGrat() {
        ModelAndView mv = new ModelAndView("gratific");
        Gratificacoes gra = new Gratificacoes();
        mv.addObject("graObj", gra);
        return mv;
    }

    @GetMapping("/listargrat")
    public ModelAndView listarDevs() {
        ModelAndView mv = new ModelAndView("listaDeDevs");
        List<Gratificacoes> listGrat = this.service.premiosDev();
        mv.addObject("gratListObj", listGrat);
        return mv;
    }
}
