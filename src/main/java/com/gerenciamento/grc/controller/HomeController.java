package com.gerenciamento.grc.controller;

import com.gerenciamento.grc.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        mv.addObject("cliente", new Cliente());
        return mv;
    }

}
