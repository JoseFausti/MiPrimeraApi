package com.example.miprimeraapi.repositories;

import com.example.miprimeraapi.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Persona, Long> {}