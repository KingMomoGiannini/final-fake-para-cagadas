package com.domination.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domination.proyecto.models.UsuarioCliente;
import com.domination.proyecto.repositories.UsuarioClienteRepository;

@Service
public class UsuarioClienteService {

    @Autowired
    private UsuarioClienteRepository usuarioClienteRepository;

    public UsuarioCliente registerUser(UsuarioCliente user) {
        return usuarioClienteRepository.save(user);
    }
}