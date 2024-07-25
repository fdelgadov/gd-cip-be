package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "portero")
public class Portero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "porId")
    private Long id;
    
    @Column(name = "porJugadorId")
    private Long jugadorId;
    
    @Column(name = "porGoles")
    private Integer goles;
    
    @Column(name = "porPartidoId")
    private Long partidoId;
    
    @Column(name = "porEquipoId")
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

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
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
