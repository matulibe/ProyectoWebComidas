package com.webproject.demo.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import javax.persistence.*;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @JsonProperty("nombre")
    @JsonAlias("nombre")
    String nombre;

    @JsonProperty("userName")
    @JsonAlias("userName")
    String userName;

    @JsonProperty("edad")
    @JsonAlias("edad")
    Integer edad;

    @JsonProperty("peso")
    @JsonAlias("peso")
    Integer peso;

    public Usuario(String name, Integer weight, Integer age){
        this.nombre = name;
        this.edad = age;
        this.peso = weight;
    }

    public void setPeso(Integer pesoNuevo){
        this.peso = pesoNuevo;
    }
}
