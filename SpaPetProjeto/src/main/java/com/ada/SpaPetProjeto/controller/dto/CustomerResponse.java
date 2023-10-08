package com.ada.SpaPetProjeto.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {
    private Integer id;
    private String nome;
    private String email;

    //somente dados essenciais que serao transmitidos ao cliente como resposta, ex id de identificacao do cliente
}
