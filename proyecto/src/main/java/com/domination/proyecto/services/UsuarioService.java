package com.domination.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domination.proyecto.models.Usuario;
import com.domination.proyecto.repositories.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registerUser(Usuario user) {
        return usuarioRepository.save(user);
    }

    public Usuario findUserByNomUsuario(String nomUsuario) {
        return usuarioRepository.findByNomUsuario(nomUsuario);
    }

    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }
}