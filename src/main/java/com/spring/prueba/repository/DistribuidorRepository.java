package com.spring.prueba.repository;

import com.spring.prueba.domain.Distribuidor;
import com.spring.prueba.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {

    }
