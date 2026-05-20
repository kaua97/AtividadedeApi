package com.example.Atividade.encapsulamento.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<EnderecoRepository,Long> {
}
