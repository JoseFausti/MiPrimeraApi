package com.example.miprimeraapi.controllers;

import com.example.miprimeraapi.entities.Persona;
import com.example.miprimeraapi.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping()
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.crearPersona(persona);
    }

    @GetMapping("/{id}")
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaService.buscarPersonaPorId(id);
    }

    @GetMapping()
    public List<Persona> listarPersonas(){
        return personaService.listarPersonas();
    }

    @PutMapping()
    public Persona actualizarPersona(@RequestBody Persona persona){
        return personaService.actualizarPersona(persona);
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
    }

}
