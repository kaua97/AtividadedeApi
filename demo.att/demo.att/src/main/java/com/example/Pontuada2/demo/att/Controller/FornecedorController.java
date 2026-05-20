package com.example.Pontuada2.demo.att.Controller;


import com.example.Pontuada2.demo.att.Dto.ClenteResponseDto;
import com.example.Pontuada2.demo.att.Dto.ClienteRequestDto;
import com.example.Pontuada2.demo.att.Service.FornecedorServicer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/Fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorServicer servicer;

    @GetMapping
    public ResponseEntity<List<ClenteResponseDto>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(servicer.lisatartodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody ClienteRequestDto dto){
        servicer.salvarFornecedor(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem","Fornecedor cadastrado com sucesso"));

    }

    @PutMapping("/{id}")

    public  ResponseEntity<Object> atualizar(@PathVariable Long id,@RequestBody @Valid ClienteRequestDto dto){
        servicer.atualizar(id,dto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("Mensagem","Forncedor atualizado com sucesso"));

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable Long id){
        servicer.excluir(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("Mesangem","Forncedor excluido com sucesso"));
    }
}
