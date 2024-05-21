package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "localidad")
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_provincia")
    private Provincia provincia;
}
