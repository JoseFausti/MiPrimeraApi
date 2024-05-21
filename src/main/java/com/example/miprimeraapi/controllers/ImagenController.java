package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ImagenController {

    @Autowired
    private ImagenService imagenService;

    @PostMapping()
    public Imagen crearImagen(@RequestBody Imagen imagen){
        return imagenService.crearImagen(imagen);
    }

    @GetMapping("/{id}")
    public Imagen buscarImagenPorId(@PathVariable Long id){
        return imagenService.buscarImagenPorId(id);
    }

    @GetMapping()
    public List<Imagen> listarImagenes(){
        return imagenService.listarImagenes();
    }

    @PutMapping()
    public Imagen actualizarImagen(@RequestBody Imagen imagen){
        return imagenService.actualizarImagen(imagen);
    }

    @DeleteMapping("/{id}")
    public void eliminarImagen(@PathVariable Long id){
        imagenService.eliminarImagen(id);
    }
}
