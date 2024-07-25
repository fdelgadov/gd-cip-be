package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Sustitucion;
import com.example.gd_cip_be.entity.repository.SustitucionRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class SustitucionService {
    
    @Autowired
    SustitucionRepository sr;
    
    public List<Sustitucion> getByPartidoIdEquipoId(Long partidoId, Long equipoId){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo);
        
        List<Sustitucion> res = new ArrayList<Sustitucion>();
        
        for(Object o: sr.findAll(finalSpec)) res.add((Sustitucion) o);
        
        return res;
    }
    
    public List<Sustitucion> saveAll(List<Sustitucion> sustituciones){
        return sr.saveAll(sustituciones);
    }
    
    public void deleteById(Long id) {
        sr.deleteById(id);
    }
}
