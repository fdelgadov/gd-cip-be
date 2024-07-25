package com.example.gd_cip_be.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.entity.repository.FaltaRepository;
import com.example.gd_cip_be.service.FaltaService;

@RestController
@RequestMapping(path = "/falta")
public class FaltaController {

    @Autowired
    FaltaService fs;
    
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        fs.deleteById(id);
    }
}
