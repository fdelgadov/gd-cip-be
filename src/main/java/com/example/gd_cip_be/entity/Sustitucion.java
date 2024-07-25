package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sustitucion")
public class Sustitucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "susId")
    private Long Id;
    
    @Column(name = "susJugadorEntraId")
    private Long jugadorEntraId;
    
    @Column(name = "susJugadorSaleId")
    private Long jugadorSaleId;
    
    @Column(name = "susDescripcion")
    private String descripcion;
    
    @Column(name = "susTiempo")
    private Integer tiempo;
    
    @Column(name = "susMinuto")
    private Integer minuto;
    
    @Column(name = "susSegundo")
    private Integer segundo;
    
    @Column(name = "susPartidoId")
    private Long partidoId;
    
    @Column(name = "susEquipoId")
    private Long equipoId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getJugadorEntraId() {
        return jugadorEntraId;
    }

    public void setJugadorEntraId(Long jugadorEntraId) {
        this.jugadorEntraId = jugadorEntraId;
    }

    public Long getJugadorSaleId() {
        return jugadorSaleId;
    }

    public void setJugadorSaleId(Long jugadorSaleId) {
        this.jugadorSaleId = jugadorSaleId;
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
