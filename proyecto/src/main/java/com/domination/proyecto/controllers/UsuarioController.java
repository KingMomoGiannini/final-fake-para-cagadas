package com.domination.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.domination.proyecto.models.Usuario;
import com.domination.proyecto.services.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registro"; // Esto devuelve la vista "register.jsp"
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String nomUsuario, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String email, @RequestParam String password, @RequestParam String celular, Model model) {
        Usuario user = new Usuario(nomUsuario, nombre, apellido, email, password, celular, "cliente");
        usuarioService.registerUser(user);

        model.addAttribute("message", "Usuario registrado ");
        return "register";
    }
}