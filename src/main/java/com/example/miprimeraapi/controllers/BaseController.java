package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.services.BaseService;
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
    public ResponseEntity<List<E>> listar(){
        List<E> entities = service.listar();
        return ResponseEntity.ok(entities);
    }

    @GetMapping("/{id}")
    public Optional<E> buscarPorId(@PathVariable ID id){
        return service.buscarPorId(id);
    }

    @PostMapping()
    public ResponseEntity<E> crear(@RequestBody E entity) {
        E entidadCreada = service.crear(entity);
        return ResponseEntity.ok(entidadCreada);
    }

    @PutMapping()
    public ResponseEntity<E> actualizar(@RequestBody E entity) {
        E entidadAct = service.actualizar(entity);
        return ResponseEntity.ok(entidadAct);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ID id) {
        service.eliminar(id);
    }

}
