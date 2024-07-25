package com.example.gd_cip_be.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.dto.ClasificacionPosDTO;
import com.example.gd_cip_be.entity.ClasificacionDet;
import com.example.gd_cip_be.service.ClasificacionService;

@RestController
@RequestMapping(path = "clasificacion")
public class ClasificacionController {

    @Autowired
    ClasificacionService s;
    
    @GetMapping(path = "/{id}")
    public ClasificacionPosDTO getById(@PathVariable("id") Long id) {
        return s.getClasificacionPosById(id);
    }
}
