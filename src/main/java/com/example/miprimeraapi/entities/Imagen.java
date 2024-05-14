package com.example.miprimeraapi.entities;

import jakarta.persistence.*;

@Entity
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
}
