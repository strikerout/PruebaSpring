package com.spring.prueba.service;

import com.spring.prueba.domain.Videojuego;
import com.spring.prueba.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoServiceImpl(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }



    @Override
    public List<Videojuego> buscarDestacados(){
       return videojuegoRepository.findAll();
     }
}
