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
@Table(name = "categorias_")
public class Categorias {

    @Id
    @Column(name = "idCat", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;

    @Column(name = "catNombre", length = 150)
    private String catNombre;

    @ManyToOne
    @JoinColumn(name = "deporte_iddeporte")
    private Deporte deporte;

    @ManyToOne
    @JoinColumn(name = "fases_idfases")
    private Fases fases;

    // Getters y setters
    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public Fases getFases() {
        return fases;
    }

    public void setFases(Fases fases) {
        this.fases = fases;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    @ManyToOne
    @JoinColumn(name = "campeonato_idCamp")
    private Campeonato campeonato;

    
}