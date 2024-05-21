package com.example.miprimeraapi.services;

import com.example.miprimeraapi.entities.Cliente;
import com.example.miprimeraapi.repositories.BaseRepository;
import com.example.miprimeraapi.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente, Long> {

    public ClienteService(ClienteRepository clienteRepository){
        super(clienteRepository);
    }

}
