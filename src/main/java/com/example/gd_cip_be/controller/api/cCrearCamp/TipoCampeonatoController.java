package com.example.gd_cip_be.controller.api.cCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.TipoCampeonato;
import com.example.gd_cip_be.service.sCrearCamp.TipoCampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoCampeonato")
public class TipoCampeonatoController {

    @Autowired
    private TipoCampeonatoService tipoCampeonatoService;

    @GetMapping
    public List<TipoCampeonato> getAllTipoCampeonatos() {
        return tipoCampeonatoService.getAllTipoCampeonatos();
    }

    @GetMapping("/{id}")
    public TipoCampeonato getTipoCampeonatoById(@PathVariable Long id) {
        return tipoCampeonatoService.getTipoCampeonatoById(id);
    }
}