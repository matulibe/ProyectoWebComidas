package com.webproject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webproject.demo.Service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/users") 

public class UsuariosController {
    @Autowired
    private UsuarioService userService;

    public UsuariosController(UsuarioService service){
        this.userService = service;
    }
}
