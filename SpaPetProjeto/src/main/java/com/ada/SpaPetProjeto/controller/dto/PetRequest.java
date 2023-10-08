package com.ada.SpaPetProjeto.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PetRequest {
    @NotBlank()
    private String nome;
    private String tipo;
    private Double peso;
    private Integer id;

}

