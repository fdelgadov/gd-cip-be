package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "partido")
public class Partido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parId", nullable = false)
    private Long id;
    
    @Column(name = "parFaseId")
    private Long faseId;
      
    @Column(name = "parEquipoId1")
    private Long equipo1Id;
    
    @Column(name = "parEquipoId2")
    private Long equipo2Id;
    
    @Column(name = "parFecha")
    private String fecha;
    
    @Column(name = "parTipoResultado")
    private String tipoResultado;
    
    @Column(name = "parMarcador1")
    private Integer marcadorEquipo1;

    @Column(name = "parMarcador2")
    private Integer marcadorEquipo2;
    
    @Column(name = "parMejorJugadorId")
    private Long mejorJugadorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFaseId() {
        return faseId;
    }

    public void setFaseId(Long faseId) {
        this.faseId = faseId;
    }

    public Long getEquipo1Id() {
        return equipo1Id;
    }

    public void setEquipo1Id(Long equipo1Id) {
        this.equipo1Id = equipo1Id;
    }

    public Long getEquipo2Id() {
        return equipo2Id;
    }

    public void setEquipo2Id(Long equipo2Id) {
        this.equipo2Id = equipo2Id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoResultado() {
        return tipoResultado;
    }

    public void setTipoResultado(String tipoResultado) {
        this.tipoResultado = tipoResultado;
    }

    public Integer getMarcadorEquipo1() {
        return marcadorEquipo1;
    }

    public void setMarcadorEquipo1(Integer marcadorEquipo1) {
        this.marcadorEquipo1 = marcadorEquipo1;
    }

    public Integer getMarcadorEquipo2() {
        return marcadorEquipo2;
    }

    public void setMarcadorEquipo2(Integer marcadorEquipo2) {
        this.marcadorEquipo2 = marcadorEquipo2;
    }

    public Long getMejorJugadorId() {
        return mejorJugadorId;
    }

    public void setMejorJugadorId(Long mejorJugadorId) {
        this.mejorJugadorId = mejorJugadorId;
    }
    
}
