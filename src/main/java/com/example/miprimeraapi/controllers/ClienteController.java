package com.example.miprimeraapi.controllers;

import com.example.miprimeraapi.entities.Cliente;
import com.example.miprimeraapi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long>{

    public ClienteController(ClienteService clienteService){
        super(clienteService);
    }

}
