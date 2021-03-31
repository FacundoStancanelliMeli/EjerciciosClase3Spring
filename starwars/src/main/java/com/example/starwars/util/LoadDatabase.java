package com.example.starwars.util;

import com.example.starwars.dtos.PersonajeDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LoadDatabase {
    private static List<PersonajeDTO> listaPersonajesJSON;

    public static List<PersonajeDTO> devolverListaPersonajesJSON(){
        return new ArrayList<>(listaPersonajesJSON);
    }

    public static void loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PersonajeDTO>> typeRef = new TypeReference<List<PersonajeDTO>>() {};
        List<PersonajeDTO> personajeDTODtos = null;

        try {
            personajeDTODtos = objectMapper.readValue(file, typeRef);

        }catch (Exception e){
            e.printStackTrace();
        }

        listaPersonajesJSON = personajeDTODtos;

    }

}
