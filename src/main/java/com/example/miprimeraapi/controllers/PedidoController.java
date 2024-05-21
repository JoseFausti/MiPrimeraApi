package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping()
    public Pedido crearPedido(@RequestBody Pedido pedido){
        return pedidoService.crearPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscarPedidoPorId(@PathVariable Long id){
        return pedidoService.buscarPedidoPorId(id);
    }

    @GetMapping()
    public List<Pedido> listarPedidos(){
        return pedidoService.listarPedidos();
    }

    @PutMapping()
    public Pedido actualizarPedido(@RequestBody Pedido pedido){
        return pedidoService.actualizarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable Long id){
        pedidoService.eliminarPedido(id);
    }
}
