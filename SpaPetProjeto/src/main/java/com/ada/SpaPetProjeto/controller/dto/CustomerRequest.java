package com.ada.SpaPetProjeto.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerRequest {
    @NotBlank()
    private String nome;
    @Email //importa caracteristicas de email
    private String email;
    private String password;

    //somente dados essenciais para criacao de um novo customer
}

