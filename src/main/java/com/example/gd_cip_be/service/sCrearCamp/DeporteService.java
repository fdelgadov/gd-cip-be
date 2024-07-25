package com.example.gd_cip_be.service.sCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.Deporte;
import com.example.gd_cip_be.entity.repository.rCrearCamp.DeporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeporteService {

    @Autowired
    private  DeporteRepository deporteRepository;

    public List<Deporte> getAllDeportes() {
        return deporteRepository.findAll();
    }

    public Deporte getDeporteById(Long id) {
        return deporteRepository.findById(id).orElse(null);
    }
}