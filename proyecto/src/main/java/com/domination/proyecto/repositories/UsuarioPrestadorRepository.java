package com.domination.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.domination.proyecto.models.UsuarioPrestador;

public interface UsuarioPrestadorRepository extends JpaRepository<UsuarioPrestador, Integer> {
}