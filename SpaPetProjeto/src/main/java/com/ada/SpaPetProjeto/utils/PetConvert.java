package com.ada.SpaPetProjeto.utils;

import com.ada.SpaPetProjeto.controller.dto.PetRequest;
import com.ada.SpaPetProjeto.controller.dto.PetResponse;
import com.ada.SpaPetProjeto.model.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PetConvert {


    public static Pet toEntity(PetRequest petDTO) {
        Pet pet = new Pet();
        pet.setNome(petDTO.getNome());
        pet.setTipo(petDTO.getTipo());
        pet.setRaca(String.valueOf(petDTO.getPeso()));
        pet.setId(petDTO.getId());
        return pet;
    }


    public static PetResponse toResponse(Pet pet) {
        PetResponse petResponse = new PetResponse();
        petResponse.setNome(pet.getNome());
        petResponse.setTipo(pet.getTipo());
        petResponse.setId(pet.getId());
        return petResponse;
    }

    @Bean
    public static List<PetResponse> toResponseList(List<Pet> pets) {
        List<PetResponse> petResponses = new ArrayList<>();
        for (Pet pet : pets) {
            PetResponse petResponse = PetConvert.toResponse(pet);
            petResponses.add(petResponse);
        }
        return petResponses;
    }
}
