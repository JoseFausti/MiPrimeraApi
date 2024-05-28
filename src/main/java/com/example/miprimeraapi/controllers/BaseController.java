package com.example.miprimeraapi.controllers;

import com.example.miprimeraapi.entities.Base;
import com.example.miprimeraapi.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseController<E extends Base, ID extends Serializable> {

    protected BaseService<E, ID> service;

    public BaseController(BaseService<E, ID> service){
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<E>> listar() throws Exception{
        try {
            List<E> entities = service.listar();
            return ResponseEntity.ok(entities);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Optional<E> buscarPorId(@PathVariable ID id)throws Exception{
        try {
            return service.buscarPorId(id);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @PostMapping()
    public ResponseEntity<E> crear(@RequestBody E entity) throws Exception{
        try {
            E entidadCreada = service.crear(entity);
            return ResponseEntity.ok(entidadCreada);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @PutMapping()
    public ResponseEntity<E> actualizar(@RequestBody E entity)throws Exception{
        try {
            E entidadAct = service.actualizar(entity);
            return ResponseEntity.ok(entidadAct);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ID id)throws Exception{
        try {
            service.eliminar(id);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
