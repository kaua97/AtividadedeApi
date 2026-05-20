package com.example.Pontuada2.demo.att.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "table_Funcionario")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)
    private String nomeFuncionario;

    @Column(nullable = false,unique = true)
    private String cpf;

    public FuncionarioModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public FuncionarioModel(Long id, String nomeFuncionario, String cpf, String email, String telefone, String setor, String salario) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.setor = setor;
        this.salario = salario;
    }

    @Column (nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String telefone;

    @Column(nullable = false,unique = true)
    private String setor;

    @Column(nullable = false,unique = true)
    private String salario;
}
