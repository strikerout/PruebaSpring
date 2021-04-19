package com.spring.prueba.controller;

import com.spring.prueba.domain.Videojuego;
import com.spring.prueba.service.VideojuegoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListadoController {

    public ListadoController(VideojuegoServiceImpl videojuegoServiceImpl) {
        this.videojuegoServiceImpl = videojuegoServiceImpl;
    }

    private final VideojuegoServiceImpl videojuegoServiceImpl;

    @RequestMapping("/")
    public String listarVideojuegos(Model model) {
        //Busqueda de los videojuegos
        List<Videojuego> destacados = videojuegoServiceImpl.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarvideojuegosPorDistribuidor(int distribuidorId, Model model) {
        List<Videojuego> juegos = videojuegoServiceImpl.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscar(@RequestParam ("q") String consulta, Model model) {
        List<Videojuego> juegos = videojuegoServiceImpl.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }


}
