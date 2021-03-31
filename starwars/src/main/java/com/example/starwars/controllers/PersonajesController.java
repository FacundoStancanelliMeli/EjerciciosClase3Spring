package com.example.starwars.controllers;

import com.example.starwars.dtos.PersonajeDTO;
import com.example.starwars.repositories.PersonajeRepository;
import com.example.starwars.services.EncontrarNombres;
import com.example.starwars.util.LoadDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personajesStarWars")
public class PersonajesController {

    @Autowired
    private EncontrarNombres encontrarNombres;

    @GetMapping("/nombrePersonaje/{nombre}")
    public List<PersonajeDTO> personajeDTO(@PathVariable String nombre){
        LoadDatabase.loadDataBase();
        return this.encontrarNombres.devolverPersonajes(nombre);
    }
}
