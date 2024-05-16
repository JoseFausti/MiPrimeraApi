package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Persona extends Base implements Serializable {

    protected String nombre;
    protected String apellido;
    protected Integer edad;

    @OneToOne
    protected Imagen imagenPersona;

    @OneToOne
    protected Usuario usuario;

}
