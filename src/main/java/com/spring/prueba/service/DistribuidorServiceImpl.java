package com.spring.prueba.service;

import com.spring.prueba.domain.Distribuidor;
import com.spring.prueba.repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorServiceImpl implements DistribuidorService{

    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorServiceImpl(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<Distribuidor> buscarTodo(){return distribuidorRepository.findAll();}

}
