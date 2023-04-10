package com.example.ejonespringboot.Controller;


import com.example.ejonespringboot.Model.Trabajo;
import com.example.ejonespringboot.Repository.TrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/trabajos")
public class TrabajoController {

    @Autowired
    private TrabajoRepository trabajoRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Trabajo> getTrabajos(){
        return trabajoRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void crearTrabajo(@RequestBody Trabajo trabajo){
        trabajoRepository.save(trabajo);

    }

}
