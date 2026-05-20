package com.example.Atividade.encapsulamento.demo.Model;


import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String logadouro;
    private String cidade;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public EnderecoModel(Long id, String cep, String logadouro, String cidade, String numero, UnidadeFederativa unidadeFederativa) {
        this.id = id;
        this.cep = cep;
        this.logadouro = logadouro;
        this.cidade = cidade;
        this.numero = numero;
        this.unidadeFederativa = unidadeFederativa;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public EnderecoModel() {
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    private String numero;

    @Enumerated(EnumType.STRING)
    private UnidadeFederativa unidadeFederativa;

}
