package com.webproject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webproject.demo.Model.Ejercicio;
import com.webproject.demo.Service.EjercicioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/gasto")

public class EjercicioController {
    @Autowired
    private EjercicioService ejercicioService;

    public EjercicioController(EjercicioService service){
        this.ejercicioService = service;
    } 

    @PostMapping(path="ejercicios")
    @ResponseStatus(HttpStatus.CREATED)
    public createEjercicio(@RequestBody Ejercicio ejercicio){
        return EjercicioService.createEjercicio(ejercicio);
    }
}
