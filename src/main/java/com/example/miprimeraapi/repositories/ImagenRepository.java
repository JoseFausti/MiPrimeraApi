package com.example.miprimeraapi.repositories;

import com.example.miprimeraapi.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Long> {
}
