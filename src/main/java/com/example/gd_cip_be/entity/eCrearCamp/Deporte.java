package com.example.gd_cip_be.entity.eCrearCamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deporte")
public class Deporte {

    @Id
    @Column(name = "depId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddeporte;

    @Column(name = "depNombre", length = 150)
    private String nombre;


    // Getters y setters
    public Long getIddeporte() {
      return iddeporte;
    }
    public void setIddeporte(Long iddeporte) {
      this.iddeporte = iddeporte;
    }
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
}