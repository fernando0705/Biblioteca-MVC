package com.biblioteca.Biblioteca.model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String obrasPublicadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setObrasPublicadas(String obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }
}
