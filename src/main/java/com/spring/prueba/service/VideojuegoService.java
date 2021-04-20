package com.spring.prueba.service;

import com.spring.prueba.domain.Videojuego;

import java.util.List;

//POR ESTANDAR CUANDO TENEMOS UN SERVICIO SE LLAMA DESDE UN CONTROLADOR, SE CREA UNA INTERFACE PARA ABSTRAER FUNCIONES
public interface VideojuegoService {

    List<Videojuego> buscarDestacados();
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);
    List<Videojuego> buscar(String consulta);

    public Videojuego guardar(Videojuego videojuego);
}
