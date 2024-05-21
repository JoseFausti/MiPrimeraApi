package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Persona extends Base {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    protected String fechaNacimiento;

    @OneToOne
    protected Imagen imagenPersona;

    @OneToOne
    protected Usuario usuario;

}
