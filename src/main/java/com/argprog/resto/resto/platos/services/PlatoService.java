package com.argprog.resto.resto.platos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argprog.resto.resto.platos.repository.PlatoRepository;

@Service
public class PlatoService implements IPlatoService{

    @Autowired
    private PlatoRepository platoRepo;
    
}
