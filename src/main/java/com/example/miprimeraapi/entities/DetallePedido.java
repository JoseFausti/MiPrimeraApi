package com.example.miprimeraapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "subtotal")
    private Double subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}
