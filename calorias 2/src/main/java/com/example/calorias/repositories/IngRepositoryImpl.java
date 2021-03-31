package com.example.calorias.repositories;

import com.example.calorias.dto.IngredienteDTO;
import com.example.calorias.util.LoadDatabase;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Repository
public class IngRepositoryImpl implements IngRepository{

    @Override
    public double encontrarCaloriaIngredientePorNombre(IngredienteDTO ingredienteDTO) {
        List<IngredienteDTO> ingDTOS = null;
        ingDTOS = LoadDatabase.devolverListaIngredientesJSON();
        double result = 0;
        Optional<IngredienteDTO> item = ingDTOS.stream()
                    .filter(ingDTO -> ingDTO.getName().equals(ingredienteDTO.getName()))
                .findFirst();
        if (item.isPresent())
            result = ingredienteDTO.getPeso()*item.get().getCalories();

        ingredienteDTO.setCalories((int) result);

        return result;
    }


}
