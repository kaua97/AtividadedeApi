package com.example.Atividade.encapsulamento.demo.Model;

import jakarta.persistence.*;

@Entity
public class ClienteModel {

    public ClienteModel(Long id, String nome, String email, EnderecoModel enderecoModel) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.enderecoModel = enderecoModel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    public ClienteModel() {
    }

    @OneToOne (cascade = CascadeType.ALL)
    private EnderecoModel enderecoModel;


}
