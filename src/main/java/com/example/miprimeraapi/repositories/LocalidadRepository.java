package com.example.miprimeraapi.repositories;

import com.example.miprimeraapi.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadRepository extends JpaRepository<Persona, Long> {
}