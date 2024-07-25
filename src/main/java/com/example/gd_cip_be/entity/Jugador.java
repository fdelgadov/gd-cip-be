package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jugId")
    private Long id;
        
    @Column(name = "jugEmail")
    private String email;
    
    @Column(name = "jugNombre")
    private String name;
    
    @Column(name = "jugApodo")
    private String shortName;
    
    @Column(name = "jugPosicion")
    private String position;
    
    @Column(name = "jugDNI")
    private String document;
    
    @Column(name = "jugTelefono")
    private String phone;
    
    @Column(name = "jugNacimiento")
    private String birthDate;
    
    @Column(name = "jugCreacion")
    private String number;
    
    @Column(name = "jugEquipoId")
    private Long equipoID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getEquipoID() {
        return equipoID;
    }

    public void setEquipoID(Long equipoID) {
        this.equipoID = equipoID;
    }
}
