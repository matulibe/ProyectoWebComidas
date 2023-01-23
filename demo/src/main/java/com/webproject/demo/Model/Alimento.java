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

public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id; 

    @JsonProperty("nombre")
    @JsonAlias("nombre")
    String nombre;

    @JsonProperty("valor energetico")
    @JsonAlias("valor energetico")
    Integer calorias;

    public Alimento(Integer calorias, String nombre){
        this.calorias = calorias;
        this.nombre = nombre;
    }

    public void setCalorias(Integer nuevo){
     this.calorias = nuevo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getCalorias() {
        return this.calorias;
    }
}
