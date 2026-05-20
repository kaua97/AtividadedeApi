package com.example.Pontuada2.demo.att.Repository;

import com.example.Pontuada2.demo.att.Model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioRepository, Long> {
    Optional<FuncionarioModel>FindyByTelefone(String telefone);
}
