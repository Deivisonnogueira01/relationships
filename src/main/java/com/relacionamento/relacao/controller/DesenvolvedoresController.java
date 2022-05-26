package com.relacionamento.relacao.controller;

import java.util.List;

import javax.validation.Valid;

import com.relacionamento.relacao.model.Desenvolvedores;
import com.relacionamento.relacao.services.DesenvolvedoresService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/desenvolvedores")
public class DesenvolvedoresController {
    
@Autowired
private DesenvolvedoresService service;

@GetMapping("/newDev")
public ModelAndView novoDev(){
    ModelAndView mv = new ModelAndView("desenvolvedores");
    Desenvolvedores devs = new Desenvolvedores();
    mv.addObject("devsObj", devs);
    return mv;
}

@GetMapping("/listarDevs")
public ModelAndView listarDevs(){
    ModelAndView mv = new ModelAndView("listaDeDevs");
   List<Desenvolvedores> listDevs = this.service.getDesenvolvedores();
   mv.addObject("DevListObj", listDevs);
   return mv;
}

@PostMapping("/saveDevs")
public ModelAndView salvarDev(@ModelAttribute @Valid Desenvolvedores dev, BindingResult result,
RedirectAttributes redirect){
    if(result.hasErrors()){
        return new ModelAndView("redirect erro");
         
    }
     service.insereDev(dev);
     return new ModelAndView("redirect:/desenvonvolvedores/listarDevs");

} 

}
