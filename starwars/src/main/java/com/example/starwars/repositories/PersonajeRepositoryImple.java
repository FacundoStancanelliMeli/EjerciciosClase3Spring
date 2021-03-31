package com.example.starwars.repositories;

import com.example.starwars.dtos.PersonajeDTO;
import com.example.starwars.util.LoadDatabase;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonajeRepositoryImple implements PersonajeRepository{

    @Override
    public List<PersonajeDTO> devolverListaPersonajesPorSuNombre(String nombre) {
        List<PersonajeDTO> personajeDTOSJSON = null;
        personajeDTOSJSON = LoadDatabase.devolverListaPersonajesJSON();
        List<PersonajeDTO> listaADevolver = new ArrayList<>();
        double result = 0;
        for (int i = 0; i < personajeDTOSJSON.size(); i++){
            String a = personajeDTOSJSON.get(i).getName();
            if (personajeDTOSJSON.get(i).getName().contains(nombre)){
                listaADevolver.add(personajeDTOSJSON.get(i));
            }
        }

        return listaADevolver;
    }
}
