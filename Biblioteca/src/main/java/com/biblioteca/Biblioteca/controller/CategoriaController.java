package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @GetMapping
    public String inicio(){
        return "categoria/inicio";
    }

    @GetMapping("/categoria")
    public String exibirCategoria(Model model){
        Categoria categoria = new Categoria();
        categoria.setArea("Livros Nacionais");
        categoria.setGênero("Brasil");

        model.addAttribute("categoria", categoria);

        return "categoria";
    }
}
