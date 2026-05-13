package AtividadeED.demo.Controller;


import AtividadeED.demo.dto.CursosRequest;
import AtividadeED.demo.dto.CursosResponse;
import AtividadeED.demo.service.CursosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/Cursos")

public class CursosController {

    @Autowired
    private CursosService service;

    @GetMapping
    public ResponseEntity<List<CursosResponse>> listar() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());

    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody CursosRequest dto) {
        service.salvarCursos(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "curso cadastrado com sucesso"));
    }

        @PutMapping("/{id}")
        public ResponseEntity<Object> atualizar (@PathVariable Long id,
                @RequestBody @Valid CursosRequest dto){

            service.atualizar(id, dto);

            return ResponseEntity.ok(
                    Map.of("mensagem", "Cursos atualizado com sucesso")
            );
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Object> excluir (@PathVariable Long id){

            service.excluir(id);

            return ResponseEntity.ok(
                    Map.of("mensagem", "Cursos excluído com sucesso")
            );
        }
    }
