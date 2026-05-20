package com.example.Atividade.encapsulamento.demo.Execption;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExeceptionHandler {

    @ExceptionHandler(ResourceNotFoundExecption.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String tratarErro(ResourceNotFoundExecption execption)
        return ex.getMenssage();
}
