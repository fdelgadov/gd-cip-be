package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fase")
public class Fase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fasId", nullable = false)
    private Long id;
    
    @Column(name = "fasTipoFase")
    private Long tipoFase;
    
    @Column(name = "fasNombre")
    private String fasNombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTipoFase() {
        return tipoFase;
    }

    public void setTipoFase(Long tipoFase) {
        this.tipoFase = tipoFase;
    }

    public String getFasNombre() {
        return fasNombre;
    }

    public void setFasNombre(String fasNombre) {
        this.fasNombre = fasNombre;
    }
}
