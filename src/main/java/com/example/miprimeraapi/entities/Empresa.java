package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empresa")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "cuil")
    private int cuil;

}
