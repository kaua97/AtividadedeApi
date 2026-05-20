package com.example.Atividade.encapsulamento.demo.Repository;

import com.example.Atividade.encapsulamento.demo.Model.UnidadeFederativa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<UnidadeFederativa,Long> {
}
