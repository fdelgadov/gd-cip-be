package com.example.gd_cip_be.service.sCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.Campeonato;
import com.example.gd_cip_be.entity.repository.rCrearCamp.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampeonatoService {

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    public List<Campeonato> getAllCampeonatos() {
        return campeonatoRepository.findAll();
    }

    public Campeonato getCampeonatoById(Long id) {
        return campeonatoRepository.findById(id).orElse(null);
    }

    public Campeonato crearCampeonato(Campeonato campeonato) {
        return campeonatoRepository.save(campeonato);
    }
}