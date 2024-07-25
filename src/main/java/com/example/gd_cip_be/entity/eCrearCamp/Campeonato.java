package com.example.gd_cip_be.entity.eCrearCamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "campeonato_unico")
public class Campeonato {
    @Id
    @Column(name = "camUniId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "camUniTitulo")
    private String tituloCampeonato;
    
    @Column(name = "camUniOrganizadorNombre")
    private String organizadorNombre;
    
    @Column(name = "camUniOrganizadorEmail")
    private String organizadorEmail;
    
    @Column(name = "camUniOrganizadorNumero")
    private String organizadorNumero;

    @Column(name = "camUniFechaInicio")
    private String fechaInicio;
    
    @Column(name = "camUniFechaFin")
    private String fechaFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloCampeonato() {
        return tituloCampeonato;
    }

    public void setTituloCampeonato(String tituloCampeonato) {
        this.tituloCampeonato = tituloCampeonato;
    }

    public String getOrganizadorNombre() {
        return organizadorNombre;
    }

    public void setOrganizadorNombre(String organizadorNombre) {
        this.organizadorNombre = organizadorNombre;
    }

    public String getOrganizadorEmail() {
        return organizadorEmail;
    }

    public void setOrganizadorEmail(String organizadorEmail) {
        this.organizadorEmail = organizadorEmail;
    }

    public String getOrganizadorNumero() {
        return organizadorNumero;
    }

    public void setOrganizadorNumero(String organizadorNumero) {
        this.organizadorNumero = organizadorNumero;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}