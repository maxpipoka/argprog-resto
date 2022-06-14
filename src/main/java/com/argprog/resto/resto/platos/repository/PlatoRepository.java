package com.argprog.resto.resto.platos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.argprog.resto.resto.platos.models.Plato;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long>{
    
}
