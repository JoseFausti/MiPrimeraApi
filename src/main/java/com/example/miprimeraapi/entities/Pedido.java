package com.example.miprimeraapi.entities;

import com.example.miprimeraapi.entities.enums.Estado;
import com.example.miprimeraapi.entities.enums.FormaPago;
import com.example.miprimeraapi.entities.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido extends Base{

    @Column(name = "hora_estimada_finalizacion")
    private LocalTime horaEstimadaFinalizacion;
    @Column(name = "total")
    private Double total;
    @Column(name = "total_costo")
    private Double totalCosto;
    @Column(name = "estado")
    private Estado estado;
    @Column(name = "tipo_envio")
    private TipoEnvio tipoEnvio;
    @Column(name = "forma_pago")
    private FormaPago formaPago;
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @OneToMany(mappedBy = "pedido",cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<DetallePedido> detallePedidos = new ArrayList<DetallePedido>();
}
