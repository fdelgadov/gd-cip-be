package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Gol;
import com.example.gd_cip_be.entity.repository.GolRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class GolService {

    @Autowired
    GolRepository gr;
    
    public List<Gol> getByPartidoIdEquipoId(Long partidoId, Long equipoId, Integer enContra){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        Specification<Object> isEnContra = PartidoDetSpecifications.isEnContra(enContra);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo).and(isEnContra);
        
        List<Gol> res = new ArrayList<Gol>();
        
        for(Object o: gr.findAll(finalSpec)) res.add((Gol) o);
        
        return res;
    }
    
    public List<Gol> saveAll(List<Gol> g) {
        return gr.saveAll(g);
    }
    
    public void deleteById(Long id) {
        gr.deleteById(id);
    }
}
