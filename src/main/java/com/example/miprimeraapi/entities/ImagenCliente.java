package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "imagen_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImagenCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;
}
