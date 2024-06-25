package com.domination.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.domination.proyecto.models.UsuarioCliente;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {
}