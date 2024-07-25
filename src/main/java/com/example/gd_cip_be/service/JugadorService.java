package com.example.gd_cip_be.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Jugador;
import com.example.gd_cip_be.entity.repository.JugadorRepository;

@Service
public class JugadorService {
    
    @Autowired
    private JugadorRepository jr;
    
    public List<Jugador> getAll(){
        return jr.findAll();
    }
    
    public Jugador save(Jugador o) {
        return jr.save(o);
    }
    
    public Jugador getById(Long id) {
        return jr.findById(id).orElseThrow(
            () -> new RuntimeException("No se encontró jugador con id "+id+"."));
    }
    
    public void deleteById(Long id) {
        jr.deleteById(id);
    }
}
