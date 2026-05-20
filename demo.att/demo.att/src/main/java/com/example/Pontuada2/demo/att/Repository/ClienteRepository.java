package com.example.Pontuada2.demo.att.Repository;

import com.example.Pontuada2.demo.att.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteModel,Long> {
    Optional<ClienteModel>FindBycpf(String cpf);
}
