package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "autho_id")
    private String authOId;

    @Column(name = "username")
    private String username;

    @OneToOne(mappedBy = "usuario_cliente")
    private Cliente cliente;
}