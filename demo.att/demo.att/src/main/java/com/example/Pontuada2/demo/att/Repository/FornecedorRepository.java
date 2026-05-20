package com.example.Pontuada2.demo.att.Repository;

import com.example.Pontuada2.demo.att.Model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;
import java.util.Optional;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
    Optional<FornecedorModel>FindyByCnpj(String cnpj);
}
