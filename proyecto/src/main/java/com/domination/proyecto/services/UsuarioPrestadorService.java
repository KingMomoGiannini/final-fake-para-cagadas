package com.domination.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domination.proyecto.models.UsuarioPrestador;
import com.domination.proyecto.repositories.UsuarioPrestadorRepository;

@Service
public class UsuarioPrestadorService {

    @Autowired
    private UsuarioPrestadorRepository usuarioPrestadorRepository;

    public UsuarioPrestador registerUser(UsuarioPrestador user) {
        return usuarioPrestadorRepository.save(user);
    }
}