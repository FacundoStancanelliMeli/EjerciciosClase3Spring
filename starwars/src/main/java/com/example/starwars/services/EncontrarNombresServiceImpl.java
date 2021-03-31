package com.example.starwars.services;

import com.example.starwars.dtos.PersonajeDTO;
import com.example.starwars.repositories.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncontrarNombresServiceImpl implements EncontrarNombres {

  private PersonajeRepository personajeRepository;

  public EncontrarNombresServiceImpl(PersonajeRepository priceRepository) {
    this.personajeRepository = priceRepository;
  }

  @Override
  public List<PersonajeDTO> devolverPersonajes(String nombre) {
    List<PersonajeDTO> listaADevolver = this.personajeRepository.devolverListaPersonajesPorSuNombre(nombre);
    return listaADevolver;
  }
}
