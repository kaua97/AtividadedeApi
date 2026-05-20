package com.example.Atividade.encapsulamento.demo.Controller;


import com.example.Atividade.encapsulamento.demo.Service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service){
        this.service= service;
    }

    @GetMapping
    public <Cliente> List<Cliente> listar(){
        return service.listar();

    }

    @PostMapping
    public <Cliente> Cliente salvar(@RequestBody Cliente cliente){
        return service.salvar(Cliente);

    }

}
