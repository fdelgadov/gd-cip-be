package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alineacion")
public class Alineacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aliId")
    private Long id;
    
    @Column(name = "aliJugadorId")
    private Long jugadorId;
    
    @Column(name = "aliPosicion")
    private String posicion;
    
    @Column(name = "aliPartidoId")
    private Long partidoId;
    
    @Column(name = "aliEquipoId")
    private Long equipoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(Long jugadorId) {
        this.jugadorId = jugadorId;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Long getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Long partidoId) {
        this.partidoId = partidoId;
    }

    public Long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }

}
