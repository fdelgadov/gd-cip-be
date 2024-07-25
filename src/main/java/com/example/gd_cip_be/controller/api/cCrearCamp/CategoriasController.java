package com.example.gd_cip_be.controller.api.cCrearCamp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.gd_cip_be.entity.eCrearCamp.Categorias;
import com.example.gd_cip_be.service.sCrearCamp.CategoriasService;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasService categoriasService;

    @GetMapping
    public List<Categorias> getAllCategorias() {
        return categoriasService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public Categorias getCategoriasById(@PathVariable Long id) {
        return categoriasService.getCategoriasById(id);
    }

    @PostMapping
    public ResponseEntity<Categorias> crearCategorias(@RequestBody Categorias categorias){
        Categorias nuevaCategorias = categoriasService.crearCategorias(categorias);
        return ResponseEntity.ok(nuevaCategorias);
    }



}