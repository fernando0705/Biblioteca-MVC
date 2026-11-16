package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivrosController {

    @GetMapping ("/")
    public String raiz(){
        return "redirect:/livros";
    }
    @GetMapping ("/livros")
    public String inicio(){
        return "livros/inicio";
    }

    @GetMapping("/livro/livro")
    public String exibirLivro(Model model){
    Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setIsbn("975-85-00-0000-0");
        livro.setDisponivel(false);

        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        autor.setNacionalidade("Brasil");
        autor.setObrasPublicadas("Dom Casmurro, Memórias Póstumas de Brás Cubas, Quincas Borba");

        Categoria categoria = new Categoria();
        categoria.setArea("Livros Nacionais");
        categoria.setGênero("Brasil");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setData("12/11/2026");
        emprestimo.setStatus(true);

        Usuario usuario = new Usuario();
        usuario.setNome("Fernando Ancioto Filho");
        usuario.setMatricula(251041029);

        model.addAttribute("livro", livro);

        return "livro";
    }
}
