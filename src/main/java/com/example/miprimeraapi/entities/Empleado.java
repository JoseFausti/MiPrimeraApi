package com.example.miprimeraapi.entities;

import com.example.miprimeraapi.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String  apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "rol")
    private Rol rol;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagen_empleado")
    private ImagenEmpleado imagenEmpleado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_empleado")
    private UsuarioEmpleado usuarioEmpleado;
}
