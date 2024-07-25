package com.example.gd_cip_be.dto;

import com.example.gd_cip_be.entity.Equipo;

public class PartidoCabDTO {

    private Long Id;  
    private Long faseId;     
    private Equipo equipo1;   
    private Equipo equipo2;   
    private String fecha;   
    private String tipoResultado;   
    private Integer marcadorEquipo1;
    private Integer marcadorEquipo2;
    private Long mejorJugadorId;
    public PartidoCabDTO(Long id, Long faseId, Equipo equipo1, Equipo equipo2, String fecha, String tipoResultado,
            Integer marcadorEquipo1, Integer marcadorEquipo2, Long mejorJugadorId) {
        super();
        Id = id;
        this.faseId = faseId;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.tipoResultado = tipoResultado;
        this.marcadorEquipo1 = marcadorEquipo1;
        this.marcadorEquipo2 = marcadorEquipo2;
        this.mejorJugadorId = mejorJugadorId;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public Long getFaseId() {
        return faseId;
    }
    public void setFaseId(Long faseId) {
        this.faseId = faseId;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
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
