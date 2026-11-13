package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping
    public String inicio(){
        return "usuario/inicio";
    }

    @GetMapping("/usuario")
    public String exibirUsuario(Model model){
        Usuario usuario = new Usuario();
        usuario.setNome("Fernando Ancioto Filho");
        usuario.setMatricula(251041029);

        model.addAttribute("usuario", usuario);

        return "usuario";
    }
}

