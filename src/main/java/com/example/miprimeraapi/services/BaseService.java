package com.example.miprimeraapi.services;

import com.example.miprimeraapi.entities.Base;
import com.example.miprimeraapi.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseService<E extends Base, ID extends Serializable> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseService(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    public List<E> listar() {
        return baseRepository.findAll();
    }

    public Optional<E> buscarPorId(ID id) {
        return Optional.ofNullable(baseRepository.findById(id).orElse(null));
    }

    public E crear(E entity) {
        return baseRepository.save(entity);
    }

    public E actualizar(E entity) {
        return baseRepository.save(entity);
    }

    public void eliminar(ID id) {
        baseRepository.deleteById(id);
    }
}
