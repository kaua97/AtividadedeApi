package com.example.Pontuada2.demo.att.Model;


import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.hibernate.internal.util.StringHelper;

@Entity
@Table(name = "table_Fornecedor")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    public FornecedorModel(Long id, String nomeFornecedor, String cnpj, String email, String telefone) {
        this.id = id;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    @Column(nullable = false)
    private String nomeFornecedor;

    public String getCnpj() {
        return cnpj;
    }

    public FornecedorModel() {
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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

    @Column(nullable = false,unique = true)
    private String cnpj;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String telefone;
}
