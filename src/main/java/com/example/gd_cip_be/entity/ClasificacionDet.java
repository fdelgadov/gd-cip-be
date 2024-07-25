package com.example.gd_cip_be.entity;

import com.example.gd_cip_be.enums.Criterio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clasificacion_det")
public class ClasificacionDet implements Comparable<ClasificacionDet> {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claDetId;
    
    @Column
    private Integer claDetPuntos;
    
    @Column
    private Integer claDetJuegos;
    
    @Column
    private Integer claDetGanados;
    
    @Column
    private Integer claDetEmpates;
    
    @Column
    private Integer claDetPerdidos;
    
    @Column
    private Integer claDetGolesFavor;
    
    @Column
    private Integer claDetGolesContra;
    
    @Column
    private Integer claDetDiferenciaPuntos;
    
    @Column
    private Integer claDetAprovechamiento;
    
    @Column
    private Integer claDetPuntosExtra;
    
    @Column
    private Integer claDetFasId;
    
    @Column
    private Long claDetEquipoId;
    
    @Column
    private Long claDetCabeceraId;

    public Long getClaDetId() {
        return claDetId;
    }

    public void setClaDetId(Long claDetId) {
        this.claDetId = claDetId;
    }

    public Integer getClaDetPuntos() {
        return claDetPuntos;
    }

    public void setClaDetPuntos(Integer claDetPuntos) {
        this.claDetPuntos = claDetPuntos;
    }

    public Integer getClaDetJuegos() {
        return claDetJuegos;
    }

    public void setClaDetJuegos(Integer claDetJuegos) {
        this.claDetJuegos = claDetJuegos;
    }

    public Integer getClaDetGanados() {
        return claDetGanados;
    }

    public void setClaDetGanados(Integer claDetGanados) {
        this.claDetGanados = claDetGanados;
    }

    public Integer getClaDetEmpates() {
        return claDetEmpates;
    }

    public void setClaDetEmpates(Integer claDetEmpates) {
        this.claDetEmpates = claDetEmpates;
    }

    public Integer getClaDetPerdidos() {
        return claDetPerdidos;
    }

    public void setClaDetPerdidos(Integer claDetPerdidos) {
        this.claDetPerdidos = claDetPerdidos;
    }

    public Integer getClaDetGolesFavor() {
        return claDetGolesFavor;
    }

    public void setClaDetGolesFavor(Integer claDetGolesFavor) {
        this.claDetGolesFavor = claDetGolesFavor;
    }

    public Integer getClaDetGolesContra() {
        return claDetGolesContra;
    }

    public void setClaDetGolesContra(Integer claDetGolesContra) {
        this.claDetGolesContra = claDetGolesContra;
    }

    public Integer getClaDetDiferenciaPuntos() {
        return claDetDiferenciaPuntos;
    }

    public void setClaDetDiferenciaPuntos(Integer claDetDiferenciaGoles) {
        this.claDetDiferenciaPuntos = claDetDiferenciaGoles;
    }

    public Integer getClaDetAprovechamiento() {
        return claDetAprovechamiento;
    }

    public void setClaDetAprovechamiento(Integer claDetAprovechamiento) {
        this.claDetAprovechamiento = claDetAprovechamiento;
    }

    public Integer getClaDetPuntosExtra() {
        return claDetPuntosExtra;
    }

    public void setClaDetPuntosExtra(Integer claDetPuntosExtra) {
        this.claDetPuntosExtra = claDetPuntosExtra;
    }

    public Integer getClaDetFasId() {
        return claDetFasId;
    }

    public void setClaDetFasId(Integer claDetFasId) {
        this.claDetFasId = claDetFasId;
    }

    public Long getClaDetEquipoId() {
        return claDetEquipoId;
    }

    public void setClaDetEquipoId(Long claDetEquipoId) {
        this.claDetEquipoId = claDetEquipoId;
    }

    public Long getClaDetCabeceraId() {
        return claDetCabeceraId;
    }

    public void setClaDetCabeceraId(Long claDetCabeceraId) {
        this.claDetCabeceraId = claDetCabeceraId;
    }
    
    public int getValueByCriterio(Criterio criterio) {
        switch (criterio) {
        case PUNTOS: {
            return this.claDetPuntos;
        }
        case APROVECHAMIENTO:{
            return this.claDetAprovechamiento;
        }
        case DIFERENCIA_PUNTOS:{
            return this.claDetDiferenciaPuntos;
        }
        case GOLES_FAVOR:{
            return this.claDetGolesFavor;
        }
        case VICTORIAS:{
            return this.claDetGanados;
        }
        case GOLES_CONTRA:{
            return this.claDetGolesContra;
        }
        default:
            throw new IllegalArgumentException("Unexpected value: " + criterio);
        }
    }

    @Override
    public int compareTo(ClasificacionDet o) {
        if(this.claDetPuntos > o.claDetPuntos) return 1;
        if(this.claDetPuntos < o.claDetPuntos) return -1;
        return 0;
    }
}
