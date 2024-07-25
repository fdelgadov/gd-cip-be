package com.example.gd_cip_be.controller.api.cCrearCamp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gd_cip_be.entity.eCrearCamp.Fases;
import com.example.gd_cip_be.service.sCrearCamp.FasesService;

import java.util.List;

@RestController
@RequestMapping("/fases")
public class FasesController {

    @Autowired
    private FasesService fasesService;

    @GetMapping
    public List<Fases> getAllFases() {
        return fasesService.getAllFases();
    }

    @GetMapping("/{id}")
    public Fases getFasesById(@PathVariable Long id) {
        return fasesService.getFasesById(id);
    }
}