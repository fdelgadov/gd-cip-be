package com.example.gd_cip_be.entity.eCrearCamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_campeonato")
public class TipoCampeonato {
    @Id
    @Column(name = "idTC", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTC;

    @Column(name = "tipo", length = 150)
    private String tipo;


    // Getters y setters
    public Long getIdTC() {
        return idTC;
    }
    public void setIdTC(Long idTC) {
        this.idTC = idTC;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}