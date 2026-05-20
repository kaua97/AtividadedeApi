package com.example.Atividade.encapsulamento.demo.Service;

import com.example.Atividade.encapsulamento.demo.Repository.ClienteRepository;
import com.example.Atividade.encapsulamento.demo.Repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteService service){
        this.repository = service.repository;

    }

    public List<EnderecoRepository> listar(){
        return repository.findAll();
    }

    public ClienteService salvar( ClienteService clienteService){
        return repository.save(Cliente);

}

}
