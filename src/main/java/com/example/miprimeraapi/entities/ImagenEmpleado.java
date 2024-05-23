package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "imagen_empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImagenEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;
}
