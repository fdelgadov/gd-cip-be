package com.example.gd_cip_be.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.UsuarioCIP;
import com.example.gd_cip_be.entity.repository.UsuarioCIPRepository;

@Service
public class UsuarioCIPService {
    @Autowired
    UsuarioCIPRepository r;
    
    public UsuarioCIP getByCIP(String CIP) {
        return r.findById(CIP)
            .orElseThrow(() -> new RuntimeException("Usuario con COP "+CIP+" no encontrado"));
    }
}
