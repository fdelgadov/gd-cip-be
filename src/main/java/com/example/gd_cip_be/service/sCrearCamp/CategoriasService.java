package com.example.gd_cip_be.service.sCrearCamp;

import com.example.gd_cip_be.entity.eCrearCamp.Categorias;
import com.example.gd_cip_be.entity.repository.rCrearCamp.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;

    public List<Categorias> getAllCategorias() {
        return categoriasRepository.findAll();
    }

    public Categorias getCategoriasById(Long id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    public Categorias crearCategorias(Categorias categorias){
        return categoriasRepository.save(categorias);
    }
}