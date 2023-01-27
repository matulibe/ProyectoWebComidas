package com.webproject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webproject.demo.Model.Ejercicio;
import com.webproject.demo.Repository.EjerciciosRepository;

@Service
public class EjercicioService {
    
    @Autowired
    private EjerciciosRepository ejerciciosRepository;

    public EjercicioService(EjerciciosRepository repository){
        this.ejerciciosRepository = repository;
    }

    public Ejercicio createEjercicio(Ejercicio ejercicio){
        return this.ejerciciosRepository.save(ejercicio);
    }
}