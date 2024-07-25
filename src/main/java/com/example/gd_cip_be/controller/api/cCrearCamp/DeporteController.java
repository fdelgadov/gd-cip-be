package com.example.gd_cip_be.controller.api.cCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.Deporte;
import com.example.gd_cip_be.service.sCrearCamp.DeporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deporte")
public class DeporteController {

    @Autowired
    private DeporteService deporteService;

    @GetMapping
    public List<Deporte> getAllDeportes() {
        return deporteService.getAllDeportes();
    }

    @GetMapping("/{id}")
    public Deporte getDeporteById(@PathVariable Long id) {
        return deporteService.getDeporteById(id);
    }
}
