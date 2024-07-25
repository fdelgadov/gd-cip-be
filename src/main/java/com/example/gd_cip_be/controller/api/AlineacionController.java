package com.example.gd_cip_be.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.entity.repository.AlineacionRepository;
import com.example.gd_cip_be.service.AlineacionService;

@RestController
@RequestMapping(path = "/alineacion")
public class AlineacionController {
    
    @Autowired
    AlineacionService as;
    
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        as.deleteById(id);
    }
}
