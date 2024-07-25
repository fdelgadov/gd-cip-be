package com.example.gd_cip_be.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.entity.Equipo;
import com.example.gd_cip_be.service.EquipoService;

@RestController
@RequestMapping(path = "/equipo")
public class EquipoController {

    @Autowired
    EquipoService es;
    
    @GetMapping
    public List<Equipo> getAll(){
        return es.getAll();
    }
    
    @GetMapping(path = "/{id}")
    public Equipo getById(@PathVariable("id") Long id) {
        return es.getById(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        es.deleteById(id);
    }
    
    @PostMapping
    public Equipo save(@RequestBody Equipo o) {
        return es.save(o);  
    }
}
