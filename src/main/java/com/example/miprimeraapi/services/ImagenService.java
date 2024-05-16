package com.example.miprimeraapi.services;

import com.example.miprimeraapi.entities.Imagen;
import com.example.miprimeraapi.repositories.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagenService {

    @Autowired
    private ImagenRepository imagenRepository;

    public Imagen crearImagen(Imagen imagen){
        return imagenRepository.save(imagen);
    }

    public Imagen buscarImagenPorId(Long id){
        return imagenRepository.findById(id).orElse(null);
    }

    public List<Imagen> listarImagenes(){
        return imagenRepository.findAll();
    }

    public Imagen actualizarImagen(Imagen imagen){
        return imagenRepository.save(imagen);
    }

    public void eliminarImagen(Long id){
        imagenRepository.deleteById(id);
    }
}
