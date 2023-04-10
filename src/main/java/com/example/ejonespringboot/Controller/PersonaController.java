package com.example.ejonespringboot.Controller;


import com.example.ejonespringboot.Model.Persona;
import com.example.ejonespringboot.DTO.PersonaDTO;
import com.example.ejonespringboot.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PersonaController {

    @Autowired
    PersonaService personaService;


    // METODO GET ---> MOSTRAR EL LISTADO DE PERSONAS EN LA BASE DE DATOS
    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersonas(){

        return personaService.listarPersonas();
    }

    // METODO POST ---> AGREGAR DATOS A LA BASE DE DATOS
    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona){

        return personaService.crearPersona(persona);
    }

    // METODO DELETE ---> ELIMINAR PERSONAS DE LA BASE DE DATOS
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id){

        personaService.borrarPersona(id);
    }

    @PostMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@RequestBody Long id){
        return personaService.buscarPersonaId(id);
    }


    // METODO PUT ---> Actualizar datos
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }



    @PostMapping("/login")
    public PersonaDTO login (@RequestBody Persona persona){
        return personaService.login(persona.getUser(), persona.getPassword());
    }




}
