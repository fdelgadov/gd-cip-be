package com.example.gd_cip_be.controller.api.cCrearCamp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.gd_cip_be.entity.eCrearCamp.Campeonato;
import com.example.gd_cip_be.service.sCrearCamp.CampeonatoService;

import java.util.List;

@RestController
@RequestMapping("/campeonato")
public class CampeonatoController {

    @Autowired
    private CampeonatoService campeonatoService;

    @GetMapping
    public List<Campeonato> getAllCampeonatos() {
        return campeonatoService.getAllCampeonatos();
    }

    @GetMapping("/{id}")
    public Campeonato getCampeonatoById(@PathVariable Long id) {
        return campeonatoService.getCampeonatoById(id);
    }

    @PostMapping
    public ResponseEntity<Campeonato> crearCampeonato(@RequestBody Campeonato campeonato) {
        Campeonato nuevoCampeonato = campeonatoService.crearCampeonato(campeonato);
        return ResponseEntity.ok(nuevoCampeonato);
    }
}