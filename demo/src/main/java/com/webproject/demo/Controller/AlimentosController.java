package com.webproject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webproject.demo.Service.AlimentoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/ingesta")

public class AlimentosController {
    @Autowired
    private AlimentoService alimentoService;
    
    public AlimentosController(AlimentoService service){
        this.alimentoService = service;
    }
}
