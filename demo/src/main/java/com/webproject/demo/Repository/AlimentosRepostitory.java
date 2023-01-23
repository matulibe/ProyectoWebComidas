package com.webproject.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.webproject.demo.Model.Alimento;

@Repository
public interface AlimentosRepostitory extends CrudRepository<Alimento, Integer>{
    
}
