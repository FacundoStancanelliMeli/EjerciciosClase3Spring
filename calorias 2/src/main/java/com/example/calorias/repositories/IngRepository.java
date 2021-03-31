package com.example.calorias.repositories;

import com.example.calorias.dto.IngredienteDTO;

public interface IngRepository {
    double encontrarCaloriaIngredientePorNombre(IngredienteDTO ingredienteDTO);
}
