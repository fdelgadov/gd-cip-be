package com.example.gd_cip_be.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Usuario;
import com.example.gd_cip_be.entity.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository r;
    
    public Usuario getById(Long id) {
        return r.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id " + id));
    }
    
    public Usuario insertUsuario(Usuario u) {
        return r.save(u);
    }
    
    public Usuario getByEmail(String email) {
        return r.getByEmail(email);
    }
    
    public Usuario login(String email, String contraseña) {
        Usuario u = r.getByEmail(email);
        
        if(u == null)
            return null;
        if(u.getUsuContraseña().contentEquals(contraseña)) {
            return u;
        }
        else {
            return null;
        }
    }
}
