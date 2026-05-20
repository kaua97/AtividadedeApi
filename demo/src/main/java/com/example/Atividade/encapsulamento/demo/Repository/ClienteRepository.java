package com.example.Atividade.encapsulamento.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<EnderecoRepository,Long> {
}
