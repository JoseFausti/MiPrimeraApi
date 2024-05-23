package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sucursal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;

    @Column(name = "horario_cierre")
    private LocalTime horarioCierre;

    @Column(name = "casa_matriz")
    private boolean casaMatriz;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio")
    private Domicilio domicilio;

    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<Empleado> empleados = new ArrayList<Empleado>();

    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<Pedido> pedidos = new ArrayList<Pedido>();
}