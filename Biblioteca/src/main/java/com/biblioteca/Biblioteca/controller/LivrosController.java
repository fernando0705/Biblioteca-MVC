package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivrosController {

    @GetMapping
    public String inicio(){
        return "livros/inicio";
    }

    @GetMapping("/livro")
    public String exibirLivro(Model model){
    Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setIsbn("975-85-00-0000-0");
        livro.setDisponivel(false);

        model.addAttribute("livro", livro);

        return "livro";
    }
}
