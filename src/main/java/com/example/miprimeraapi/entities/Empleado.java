package com.example.miPrimeraApi.entities;

import com.example.miPrimeraApi.entities.enums.TipoEmpleado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona{

    @Column(name = "tipo_empleado")
    private TipoEmpleado tipoEmpleado;

}
