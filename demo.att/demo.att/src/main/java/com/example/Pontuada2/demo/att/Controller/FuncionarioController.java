package com.example.Pontuada2.demo.att.Controller;


import com.example.Pontuada2.demo.att.Dto.FuncionarioRequestDto;
import com.example.Pontuada2.demo.att.Dto.FuncionarioResponseDto;
import com.example.Pontuada2.demo.att.Service.FuncionarioService;
import jakarta.validation.Valid;
import org.aspectj.weaver.patterns.HasMemberTypePatternForPerThisMatching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("Funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService service;

    @GetMapping
    ResponseEntity<List<FuncionarioResponseDto>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listar());
    }

@PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@valid @RequestBody FuncionarioRequestDto dto){
        service.salvarFuncionario(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem","Funcionario cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody @Valid FuncionarioRequestDto dto) {
        service.atualizar();
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Funcionario atualizado com  sucesso"));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id){
        service.excluir();
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("Mensagem","Funccionario deletado com sucesso"));

    }

}
