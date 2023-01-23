package com.webproject.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.webproject.demo.Model.Ejercicio;

@Repository
public interface EjerciciosRepository extends CrudRepository<Ejercicio, Integer> {

}