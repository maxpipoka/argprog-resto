package com.argprog.resto.resto.platos.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.resto.resto.platos.models.Plato;
import com.argprog.resto.resto.platos.repository.PlatoRepository;

@Service
public class PlatoService implements IPlatoService{

    @Autowired
    private PlatoRepository platoRepo;

    @Override
    public List<Plato> getPlatos(){
        List<Plato> platos = platoRepo.findAll();
        return platos;
    }

    @Override
    public void savePlato(Plato plato){
        platoRepo.save(plato);
    }

    @Override
    public void deletePlato(Long idPlato){
        platoRepo.deleteById(idPlato);
    }

    @Override
    public Plato findPlato(Long idPlato){
        Plato findedPlato = platoRepo.findById(idPlato).orElse(null);
        return findedPlato;
    }
}
