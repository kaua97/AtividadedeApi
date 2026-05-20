package com.example.Pontuada2.demo.att.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Tab_Cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCliente;

    public ClienteModel(Long id, String nomeCliente, String nome, String cpf, String datadenascimento, String email, String senha) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.nome = nome;
        this.cpf = cpf;
        Datadenascimento = datadenascimento;
        this.email = email;
        this.senha = senha;
    }

    @Column(nullable = false,unique = true)
    private String nome;

    @Column (nullable = false,unique = true)
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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

    public String getDatadenascimento() {
        return Datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        Datadenascimento = datadenascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ClienteModel() {
    }

    @Column(nullable = false,unique = true)
    private String Datadenascimento;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String senha;
}
