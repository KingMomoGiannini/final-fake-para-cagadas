package com.domination.proyecto.models;

import jakarta.persistence.Entity;

@Entity
public class UsuarioPrestador extends Usuario {
    
    private int idPrestador;

    public UsuarioPrestador() {}
    
    public UsuarioPrestador(String nomUsuario, String nombre, String apellido, String email, String password, String celular) {
        super(nomUsuario, nombre, apellido, email, password, celular,"prestador");
       
    }

    public UsuarioPrestador(int idPrestador, int idUsuario, String nomUsuario, String nombre, String apellido, String email, String password, String celular, String rol) {
        super(idUsuario, nomUsuario, nombre, apellido, email, password, celular, rol);
        this.idPrestador = idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public int getIdPrestador() {
        return idPrestador;
    }
    
}
