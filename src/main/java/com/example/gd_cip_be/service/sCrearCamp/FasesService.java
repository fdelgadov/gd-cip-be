package com.example.gd_cip_be.service.sCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.Fases;
import com.example.gd_cip_be.entity.repository.rCrearCamp.FasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FasesService {

    @Autowired
    private FasesRepository fasesRepository;

    public List<Fases> getAllFases() {
        return fasesRepository.findAll();
    }

    public Fases getFasesById(Long id) {
        return fasesRepository.findById(id).orElse(null);
    }
}