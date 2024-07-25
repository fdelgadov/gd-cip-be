package com.example.gd_cip_be.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gd_cip_be.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario getByEmail(String email);
}
