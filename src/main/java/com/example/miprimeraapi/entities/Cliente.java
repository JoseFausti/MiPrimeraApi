package com.example.miprimeraapi.entities;

import com.example.miprimeraapi.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "rol")
    private Rol rol;


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagen_cliente")
    private ImagenCliente imagenCliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_cliente")
    private UsuarioCliente usuarioCliente;

}
