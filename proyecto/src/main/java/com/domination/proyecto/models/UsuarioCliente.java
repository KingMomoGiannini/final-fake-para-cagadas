package com.domination.proyecto.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("CLIENTE")
public class UsuarioCliente extends Usuario {

    @Column(name = "idcliente")
    private int idCliente;

    public UsuarioCliente() {}

    public UsuarioCliente(String nomUsuario, String nombre, String apellido, String email, String password, String celular) {
        super(nomUsuario, nombre, apellido, email, password, celular, "cliente");
    }

    public UsuarioCliente(int idCliente, int idUsuario, String nomUsuario, String nombre, String apellido, String email, String password, String celular, String rol) {
        super(idUsuario, nomUsuario, nombre, apellido, email, password, celular, rol);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}