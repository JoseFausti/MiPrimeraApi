package com.example.miprimeraapi.services;

import com.example.miprimeraapi.entities.Base;
import com.example.miprimeraapi.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<E extends Base, ID extends Serializable> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseService(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Transactional
    public List<E> listar() {
        return baseRepository.findAll();
    }

    @Transactional
    public Optional<E> buscarPorId(ID id) {
        return Optional.ofNullable(baseRepository.findById(id).orElse(null));
    }

    @Transactional
    public E crear(E entity) {
        return baseRepository.save(entity);
    }

    @Transactional
    public E actualizar(E entity) {
        return baseRepository.save(entity);
    }

    @Transactional
    public void eliminar(ID id) {
        baseRepository.deleteById(id);
    }
}
