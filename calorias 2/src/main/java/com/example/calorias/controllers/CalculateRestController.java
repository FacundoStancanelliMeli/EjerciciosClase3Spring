package com.example.calorias.controllers;

import com.example.calorias.dto.IngredienteDTO;
import com.example.calorias.dto.PlatoDTO;
import com.example.calorias.services.CalculateServiceImpl;
import com.example.calorias.util.LoadDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcularPlatos")
public class CalculateRestController {

  @Autowired
  private CalculateServiceImpl calculateService;

  @PostMapping("/devolverCalorias")
  public double devolverCaloriasDePlato(@RequestBody PlatoDTO platoDTO){
    LoadDatabase.loadDataBase();
    return calculateService.dolverCaloriasDePlato(platoDTO);
  }

  @PostMapping("/devolverIngConMasCalorias")
  public IngredienteDTO devolverIngredienteConMasCalorias(@RequestBody PlatoDTO platoDTO){
    LoadDatabase.loadDataBase();
    return calculateService.devolverIngredienteConMasCalorias(platoDTO);
  }

  @PostMapping("/devolverCaloriasPorIng")
  public double[] dolverCaloriasPorIngrediente(@RequestBody PlatoDTO platoDTO){
    LoadDatabase.loadDataBase();
    return calculateService.dolverCaloriasPorIngrediente(platoDTO);
  }
}
