package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Falta;
import com.example.gd_cip_be.entity.repository.FaltaRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class FaltaService {
    
    @Autowired
    FaltaRepository fr;
    
    public List<Falta> getByPartidoIdEquipoId(Long partidoId, Long equipoId){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo);
        
        List<Falta> res = new ArrayList<Falta>();
        
        for(Object o: fr.findAll(finalSpec)) res.add((Falta) o);
        
        return res;
    }
    
    public List<Falta> saveAll(List<Falta> faltas){
        return fr.saveAll(faltas);
    }
    
    public void deleteById(Long id) {
        fr.deleteById(id);
    }
}
