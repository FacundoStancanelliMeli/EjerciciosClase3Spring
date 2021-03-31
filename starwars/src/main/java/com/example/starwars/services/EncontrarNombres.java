package com.example.starwars.services;

import com.example.starwars.dtos.PersonajeDTO;

import java.util.List;

public interface EncontrarNombres {
    List<PersonajeDTO>devolverPersonajes(String nombre);
}
