package com.example.calorias.services;


import com.example.calorias.dto.*;
import com.example.calorias.repositories.IngRepository;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

  private IngRepository ingRepository;

  public CalculateServiceImpl(IngRepository priceRepository) {
    this.ingRepository = priceRepository;
  }


  @Override
  public double dolverCaloriasDePlato(PlatoDTO platoDTO) {
    double calorias = 0;
    for (int i = 0; i < platoDTO.getListaIngredientes().size(); i++){
      calorias +=ingRepository.encontrarCaloriaIngredientePorNombre(platoDTO.getListaIngredientes().get(i));
    }

    return calorias;
  }

  @Override
  public double[] dolverCaloriasPorIngrediente(PlatoDTO platoDTO) {
    double[] calorias = new double[platoDTO.getListaIngredientes().size()];
    for (int i = 0; i < platoDTO.getListaIngredientes().size(); i++){
      calorias[i] = ingRepository.encontrarCaloriaIngredientePorNombre(platoDTO.getListaIngredientes().get(i));
    }

    return calorias;
  }

  @Override
  public IngredienteDTO devolverIngredienteConMasCalorias(PlatoDTO platoDTO) {
    double max = 0;
    IngredienteDTO ingredienteDTO = null;
    for (int i = 0; i < platoDTO.getListaIngredientes().size(); i++){
      if (ingRepository.encontrarCaloriaIngredientePorNombre(platoDTO.getListaIngredientes().get(i)) >= max){
        max = ingRepository.encontrarCaloriaIngredientePorNombre(platoDTO.getListaIngredientes().get(i));
        ingredienteDTO = platoDTO.getListaIngredientes().get(i);
      }
    }
    
    return ingredienteDTO;

  }
}
