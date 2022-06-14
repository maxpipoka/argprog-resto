package com.argprog.resto.resto.platos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plato {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idPlato;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private double precio; 
    
    @Column(nullable=false)
    private String descripcion;

    public Plato(){}

    public Plato(Long idPlato, String nombre, double precio, String descripcion) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Long getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(Long idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    };

    

    
}
