package br.com.fiap.model;

public class Motorista {
    String nome;
    String cpf;
    String celular;
    String habilitacao;
    String categoria;


    public Motorista() {
    }

    public Motorista(String nome, String cpf, String celular, String habilitacao, String categoria) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.habilitacao = habilitacao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }





}