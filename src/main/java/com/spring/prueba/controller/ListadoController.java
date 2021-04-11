package com.spring.prueba.controller;

import com.spring.prueba.domain.Videojuego;
import com.spring.prueba.service.VideojuegoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    public ListadoController(VideojuegoServiceImpl videojuegoServiceImpl) {
        this.videojuegoServiceImpl = videojuegoServiceImpl;
    }

    private final VideojuegoServiceImpl videojuegoServiceImpl;

    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        //Busqueda de los videojuegos
        List<Videojuego> destacados = videojuegoServiceImpl.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

}
