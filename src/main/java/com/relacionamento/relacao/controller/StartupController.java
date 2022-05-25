package com.relacionamento.relacao.controller;

import java.util.List;

import javax.validation.Valid;

import com.relacionamento.relacao.model.Startup;
import com.relacionamento.relacao.services.StartupService;

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
@RequestMapping("/startup")
public class StartupController {
    

@Autowired
private StartupService service;

@GetMapping("/newDev")
public ModelAndView newProdutos(){
    ModelAndView mv = new ModelAndView("desenvolvedores");
    Startup star = new Startup();
    mv.addObject("devsObj", star);
    return mv;
}

@GetMapping("/listarStartup")
public ModelAndView listarTodosProdutos(){
    ModelAndView mv = new ModelAndView("listaDeDevs");
   List<Startup> listStartup = this.service.buscaStartup();
   mv.addObject("DevListObj", listStartup);
   return mv;
}

@PostMapping("/saveStartup")
public ModelAndView salvarStartup(@ModelAttribute @Valid Startup star, BindingResult result,
RedirectAttributes redirect){
    if(result.hasErrors()){
        return new ModelAndView("redirect erro");
         
    }
     service.atualizaStartup(star);
     return new ModelAndView("redirect:/startup/listarStartup");

} 

}
