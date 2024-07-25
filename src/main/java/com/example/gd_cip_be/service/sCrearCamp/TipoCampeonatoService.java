package com.example.gd_cip_be.service.sCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.TipoCampeonato;
import com.example.gd_cip_be.entity.repository.rCrearCamp.TipoCampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCampeonatoService {

    @Autowired
    private TipoCampeonatoRepository tipoCampeonatoRepository;

    public List<TipoCampeonato> getAllTipoCampeonatos() {
        return tipoCampeonatoRepository.findAll();
    }

    public TipoCampeonato getTipoCampeonatoById(Long id) {
        return tipoCampeonatoRepository.findById(id).orElse(null);
    }
}