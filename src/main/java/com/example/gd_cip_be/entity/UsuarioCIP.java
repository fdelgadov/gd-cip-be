package com.example.gd_cip_be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_cip")
public class UsuarioCIP {
    @Id
    @Column(name = "usuCipCIP", nullable = false)
    private String CIP;

    public String getCIP() {
        return CIP;
    }

    public void setCIP(String cIP) {
        CIP = cIP;
    }
}
