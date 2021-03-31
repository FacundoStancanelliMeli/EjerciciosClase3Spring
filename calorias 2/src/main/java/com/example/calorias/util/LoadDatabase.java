package com.example.calorias.util;

import com.example.calorias.dto.IngredienteDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LoadDatabase {
    private static List<IngredienteDTO> listIngredientesJson;

    public static List<IngredienteDTO> devolverListaIngredientesJSON(){
        return new ArrayList<>(listIngredientesJson);
    }

    public static void loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredienteDTO>> typeRef = new TypeReference<List<IngredienteDTO>>() {};
        List<IngredienteDTO> ingDtos = null;

        try {
            ingDtos = objectMapper.readValue(file, typeRef);

        }catch (Exception e){
            e.printStackTrace();
        }

        listIngredientesJson = ingDtos;

    }

}
