package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugada")
public class Jugada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jugaId")
    private Long id;
    
    @Column(name = "jugaJugadorId")
    private Long jugadorId;
    
    @Column(name = "jugaDescripcion")
    private String descripcion;
    
    @Column(name = "jugaTiempo")
    private Integer tiempo;
    
    @Column(name = "jugaMinuto")
    private Integer minuto;
    
    @Column(name = "jugaSegundo")
    private Integer segundo;
    
    @Column(name = "jugaPartidoId")
    private Long partidoId;
    
    @Column(name = "jugaEquipoId")
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
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
