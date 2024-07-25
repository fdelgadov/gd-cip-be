package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuId", nullable = false)
    private Long id;
    
    @Column(name = "usuEmail", length = 254, nullable = false)
    private String email;
    
    @Column(name = "usuNombre", length = 150)
    private String nombre;
    
    @Column(name = "usuContraseña", length = 45)
    private String contraseña;
    
    public Long getUsuId() {
        return id;
    }
    public void setUsuId(Long usuId) {
        this.id = usuId;
    }
    public String getUsuEmail() {
        return email;
    }
    public void setUsuEmail(String usuEmail) {
        this.email = usuEmail;
    }
    public String getUsuNombre() {
        return nombre;
    }
    public void setUsuNombre(String usuNombre) {
        this.nombre = usuNombre;
    }
    public String getUsuContraseña() {
        return contraseña;
    }
    public void setUsuContraseña(String usuContraseña) {
        this.contraseña = usuContraseña;
    }
}
