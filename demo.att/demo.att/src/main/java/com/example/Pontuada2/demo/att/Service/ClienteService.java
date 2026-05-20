package com.example.Pontuada2.demo.att.Service;


import com.example.Pontuada2.demo.att.Dto.ClenteResponseDto;
import com.example.Pontuada2.demo.att.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
     private ClienteRepository repository;

    public List<ClenteResponseDto> listartodos(){
        return repository
                .findAll()
                .stream()
                .map(Clinte-> new ClenteResponseDto(
                        Clinte.getNomeCliente(),
                        Clinte.getEmail()))
                .toList();

    }
}
