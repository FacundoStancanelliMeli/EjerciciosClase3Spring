package com.example.calorias.services;

import com.example.calorias.dto.IngredienteDTO;
import com.example.calorias.dto.PlatoDTO;

public interface CalculateService {

    double dolverCaloriasDePlato(PlatoDTO platoDTO);

    double[] dolverCaloriasPorIngrediente(PlatoDTO platoDTO);

    IngredienteDTO devolverIngredienteConMasCalorias(PlatoDTO platoDTO);

}
