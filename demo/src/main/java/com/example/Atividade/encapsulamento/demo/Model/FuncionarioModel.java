package com.example.Atividade.encapsulamento.demo.Model;


import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  nome;
    private String matricula;
    private String datadenascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEnderecoModel() {
        return enderecoModel;
    }

    public void setEnderecoModel(EnderecoModel enderecoModel) {
        this.enderecoModel = enderecoModel;
    }

    private Double salario;
    private String email;

    public FuncionarioModel(Long id, String nome, String matricula, String datadenascimento, Double salario, String email, EnderecoModel enderecoModel) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.datadenascimento = datadenascimento;
        this.salario = salario;
        this.email = email;
        this.enderecoModel = enderecoModel;
    }

    public FuncionarioModel() {
    }

    @OneToOne(cascade = CascadeType.ALL)
    private EnderecoModel enderecoModel;
}
