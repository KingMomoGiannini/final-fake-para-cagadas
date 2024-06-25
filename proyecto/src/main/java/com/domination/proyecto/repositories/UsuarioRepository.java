package com.domination.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.domination.proyecto.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Usuario findByNomUsuario(String nomUsuario);
    
}