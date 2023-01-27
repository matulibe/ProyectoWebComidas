package com.webproject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

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
    public Ejercicio createEjercicio(@RequestBody Ejercicio ejercicio){
        return this.ejercicioService.createEjercicio(ejercicio);
    }
}
