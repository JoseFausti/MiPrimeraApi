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
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "provincia")
    private List<Localidad>localidades = new ArrayList<Localidad>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_pais")
    private Pais pais;
}
