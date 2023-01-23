package com.webproject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webproject.demo.Repository.UsuariosRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuariosRepository usuariosRepository;                                                                                                                                                                                            
}
