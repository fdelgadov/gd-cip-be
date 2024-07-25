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

import com.example.gd_cip_be.entity.Jugador;
import com.example.gd_cip_be.service.JugadorService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/jugador")
public class JugadorController {
    
    @Autowired
    JugadorService js;
    
    @GetMapping
    public List<Jugador> getAll(){
        return js.getAll();
    }
    
    @PostMapping
    public Jugador save(@RequestBody Jugador o) {
        return js.save(o);
    }
    
    @GetMapping(path = "/{id}")
    public Jugador getById(@PathVariable("id") Long id) {
        return js.getById(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        js.deleteById(id);
    }
}
