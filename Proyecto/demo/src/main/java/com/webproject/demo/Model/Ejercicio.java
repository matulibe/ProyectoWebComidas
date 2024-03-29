package com.webproject.demo.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import javax.persistence.*;

public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @JsonProperty("nombre")
    @JsonAlias("nombre")
    String nombre;

    public Ejercicio(String nombre, Integer gasto){
        this.nombre = nombre;
    }

    public Integer calcularCaloriasQuemadas(){
        return 1;
    }

}
