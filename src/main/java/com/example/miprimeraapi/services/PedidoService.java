package com.example.miprimeraapi.services;

import com.example.miprimeraapi.entities.Pedido;
import com.example.miprimeraapi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crearPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedidoPorId(Long id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> listarPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido actualizarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public void eliminarPedido(Long id){
        pedidoRepository.deleteById(id);
    }

}
