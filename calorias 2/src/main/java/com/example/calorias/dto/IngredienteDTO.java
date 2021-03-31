package com.example.calorias.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDTO {
    private String name;
    private double peso;
    private int calories;

    public IngredienteDTO(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public IngredienteDTO(String name, double peso) {
        this.name = name;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public double getPeso() {
        return peso;
    }

    public double getCalories() {
        return calories;
    }
}
