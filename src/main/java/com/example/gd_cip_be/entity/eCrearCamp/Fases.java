package com.example.gd_cip_be.entity.eCrearCamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fases")
public class Fases {
    @Id
    @Column(name = "idfases", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfases;

    @Column(name = "nombre", length = 150)
    private String nombre;

    // Getters y setters
    public Long getIdfases() {
        return idfases;
    }
    public void setIdfases(Long idfases) {
        this.idfases = idfases;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}