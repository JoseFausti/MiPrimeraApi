package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends BaseRepository<Imagen, Long> {
}
