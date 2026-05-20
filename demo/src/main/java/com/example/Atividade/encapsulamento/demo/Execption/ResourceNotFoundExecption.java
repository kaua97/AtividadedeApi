package com.example.Atividade.encapsulamento.demo.Execption;

public class ResourceNotFoundExecption extends RuntimeException {

    public ResourceNotFoundExecption(String mensagem){
        super(mensagem);
    }
}
