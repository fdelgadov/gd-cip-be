package com.example.gd_cip_be.dto;

import java.util.List;

import com.example.gd_cip_be.entity.ClasificacionCab;

public class ClasificacionPosDTO {
    private ClasificacionCab cabecera;
    private List<ClasificacionPosDetDTO> detalle;
    
    public ClasificacionPosDTO(ClasificacionCab cabecera, List<ClasificacionPosDetDTO> detalle) {
        this.cabecera = cabecera;
        this.detalle = detalle;
    }
    
    public ClasificacionCab getCabecera() {
        return cabecera;
    }

    public void setCabecera(ClasificacionCab cabecera) {
        this.cabecera = cabecera;
    }

    public List<ClasificacionPosDetDTO> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<ClasificacionPosDetDTO> detalle) {
        this.detalle = detalle;
    }
}
