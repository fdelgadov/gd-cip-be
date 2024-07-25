package com.example.gd_cip_be.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Fase;
import com.example.gd_cip_be.entity.repository.FaseRepository;

@Service
public class FaseService {

    @Autowired
    FaseRepository fr;
    
    public Fase getById(Long id) {
        return fr.findById(id).orElseThrow(() -> new RuntimeException("No se encontró fase con id "+id+"."));
    }
}
