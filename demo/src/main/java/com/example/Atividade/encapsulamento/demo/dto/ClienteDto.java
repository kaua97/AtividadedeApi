package com.example.Atividade.encapsulamento.demo.dto;

public class ClienteDto {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public ClienteDto() {
    }

    public ClienteDto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
