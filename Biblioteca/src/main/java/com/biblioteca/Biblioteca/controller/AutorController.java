package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @GetMapping
    public String inicio(){
        return "autor/inicio";
    }

    @GetMapping("/autor")
    public String exibirAutor(Model model){
        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        autor.setNacionalidade("Brasil");
        autor.setObrasPublicadas("Dom Casmurro, Memórias Póstumas de Brás Cubas, Quincas Borba");

        model.addAttribute("autor", autor);

        return "autor";
    }
}
