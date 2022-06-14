package com.argprog.resto.resto.platos.services;

import java.util.List;

import com.argprog.resto.resto.platos.models.Plato;

public interface IPlatoService {
    
    public List<Plato> getPlatos();

    public void savePlato(Plato plato);

    public void deletePlato(Long idPlato);

    public Plato findPlato(Long idPlato);

}
