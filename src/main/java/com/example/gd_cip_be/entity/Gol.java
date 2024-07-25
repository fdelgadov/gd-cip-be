package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gol")
public class Gol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "golId")
    private Long id;
    
    @Column(name = "golJugadorId")
    private Long jugadorId;
    
    @Column(name = "golAsistenciaId")
    private Long asistenciaId;
    
    @Column(name = "golDescripcion")
    private String descripcion;
    
    @Column(name = "golTiempo")
    private Integer tiempo;
    
    @Column(name = "golMinuto")
    private Integer minuto;
    
    @Column(name = "golSegundo")
    private Integer segundo;
    
    @Column(name = "golEnContra")
    private Integer enContra;
    
    @Column(name = "golPartidoId")
    private Long partidoId;
    
    @Column(name = "golEquipoId")
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

    public Long getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(Long asistenciaId) {
        this.asistenciaId = asistenciaId;
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

    public Integer getEnContra() {
        return enContra;
    }

    public void setEnContra(Integer enContra) {
        this.enContra = enContra;
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
