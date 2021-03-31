package com.example.calorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {

    private String nombrePlato;
    private List<IngredienteDTO>listaIngredientes;

}
