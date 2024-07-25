package com.example.gd_cip_be.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Equipo;
import com.example.gd_cip_be.entity.repository.EquipoRepository;

@Service
public class EquipoService {

    @Autowired
    EquipoRepository er;
    
    public Equipo getById(Long id) {
        return er.findById(id)
            .map(equipo -> equipo)
            .orElse(null);
    }
    
    public List<Equipo> getAll(){
        return er.findAll();
    }
    
    public void deleteById(Long id) {
        er.deleteById(id);
    }
    
    public Equipo save(Equipo o) {
        return er.save(o);
    }
}
