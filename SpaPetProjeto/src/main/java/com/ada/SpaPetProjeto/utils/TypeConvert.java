package com.ada.SpaPetProjeto.utils;

import com.ada.SpaPetProjeto.controller.dto.TypeRequest;
import com.ada.SpaPetProjeto.controller.dto.TypeResponse;
import com.ada.SpaPetProjeto.model.Type;

import java.util.ArrayList;
import java.util.List;

public class TypeConvert {

    public static Type toEntity(TypeRequest typeRequest){
        Type type = new Type();
        type.setId(typeRequest.getId());
        type.setNomeServico(typeRequest.getNomeServico());
        type.setDescricaoServico(typeRequest.getDescricaoServico());
        type.setPrecoServico(typeRequest.getPrecoServico());
        return type;
    }

    public static TypeResponse toResponse(Type type){
        TypeResponse typeResponse = new TypeResponse();
        typeResponse.setId(type.getId());
        typeResponse.setNomeServico(type.getNomeServico());
        typeResponse.setPrecoServico(type.getPrecoServico());
        return typeResponse;
    }

    public static List<TypeResponse> toResponseList(List<Type> types){
        List<TypeResponse> typeResponses = new ArrayList<>();
        for(Type type : types){
            typeResponses.add(toResponse(type));
        }
        return typeResponses;
    }
}
