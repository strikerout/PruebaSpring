package com.spring.prueba.repository;

import com.spring.prueba.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
}
