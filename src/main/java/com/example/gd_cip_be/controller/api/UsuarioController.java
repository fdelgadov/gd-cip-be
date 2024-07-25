package com.example.gd_cip_be.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.entity.Usuario;
import com.example.gd_cip_be.service.UsuarioService;

@RestController
@RequestMapping(path = "usuario")
public class UsuarioController {
    @Autowired
    UsuarioService s;
    
    @GetMapping(path = "/{id}")
    public Usuario getById(@PathVariable("id") Long id) {
        return s.getById(id);
    }
    
    @PostMapping
    public Usuario insertUsuario(@RequestBody Usuario u) {
        return s.insertUsuario(u);
    }
    
    @PostMapping(path = "/getEmail")
    public Usuario getByEmail(@RequestBody Usuario u) {
        return s.getByEmail(u.getUsuEmail());
    }
    
    @PostMapping(path = "/login")
    public Usuario login(@RequestBody Usuario u) {
        return s.login(u.getUsuEmail(), u.getUsuContraseña());
    }
}
