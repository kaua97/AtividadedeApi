package com.example.Atividade.encapsulamento.demo.dto;

import java.util.PrimitiveIterator;

public class FuncionarioDto {
    private String nome;

    public String getMatricula() {
        return Matricula;
    }

    public FuncionarioDto() {
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public FuncionarioDto(String nome, String matricula, Double salario) {
        this.nome = nome;
        Matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    private String Matricula;
    private Double salario;
}
