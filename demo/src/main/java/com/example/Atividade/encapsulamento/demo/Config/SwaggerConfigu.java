package com.example.Atividade.encapsulamento.demo.Config;


import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfigu {

    @Bean
    public OpenAPi CustomOpenAPi(){
        return new OpenAPi()
                .info(new Info()
                        .title("API Atividade")
                        .version("1.0"));

    }
}
