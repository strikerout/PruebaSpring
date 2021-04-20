package com.spring.prueba.service;

import com.spring.prueba.domain.Distribuidor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//POR ESTANDAR CUANDO TENEMOS UN SERVICIO SE LLAMA DESDE UN CONTROLADOR, SE CREA UNA INTERFACE PARA ABSTRAER FUNCIONES
public interface DistribuidorService {

    List<Distribuidor> buscarTodo();
}
