package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clasificacion_cab")
public class ClasificacionCab {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claCabId;
    
    @Column
    private Long claCabGrupoId;

    public Long getClaCabId() {
        return claCabId;
    }

    public void setClaCabId(Long claCabId) {
        this.claCabId = claCabId;
    }

    public Long getClaCabGrupoId() {
        return claCabGrupoId;
    }

    public void setClaCabGrupoId(Long claCabGrupoId) {
        this.claCabGrupoId = claCabGrupoId;
    }
}
