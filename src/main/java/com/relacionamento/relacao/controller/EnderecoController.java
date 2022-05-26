package com.relacionamento.relacao.controller;

import javax.validation.Valid;

import com.relacionamento.relacao.model.Endereço;
import com.relacionamento.relacao.services.EnderecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PutMapping("/atualizaEndereco")
    public ModelAndView salvarEndereco(@ModelAttribute @Valid Endereço end, BindingResult result,
            RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return new ModelAndView("redirect erro");

        }
        service.atualizaEndereco(end);
        return new ModelAndView("redirect:/enderecos/atualizaEndereco");

    }

}