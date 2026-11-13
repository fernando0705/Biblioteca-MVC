package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @GetMapping
    public String inicio(){
        return "emprestimo/inicio";
    }

    @GetMapping("/emprestimo")
    public String exibirEmprestimo(Model model){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setData("12/11/2026");
        emprestimo.setStatus(true);

        model.addAttribute("emprestimo", emprestimo);

        return "emprestimo";
    }
}

