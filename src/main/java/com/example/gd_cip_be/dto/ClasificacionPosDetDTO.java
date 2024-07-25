package com.example.gd_cip_be.dto;

import com.example.gd_cip_be.entity.ClasificacionDet;

public class ClasificacionPosDetDTO {
    private Integer posicion;
    private ClasificacionDet clasificacionDet;
    
    public ClasificacionPosDetDTO(Integer posicion, ClasificacionDet clasificacionDet) {
        this.setPosicion(posicion);
        this.setClasificacionDet(clasificacionDet);
    }

    public ClasificacionDet getClasificacionDet() {
        return clasificacionDet;
    }

    public void setClasificacionDet(ClasificacionDet clasificacionDet) {
        this.clasificacionDet = clasificacionDet;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
}
