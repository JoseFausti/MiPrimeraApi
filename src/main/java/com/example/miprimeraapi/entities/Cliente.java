package com.example.miprimeraapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Table(name = "clientes")
@Builder
public class Cliente extends Persona implements Serializable{
    public Cliente() {

    }
}
