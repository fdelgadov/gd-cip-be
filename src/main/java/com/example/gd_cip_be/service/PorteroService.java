package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Portero;
import com.example.gd_cip_be.entity.repository.PorteroRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class PorteroService {
    
    @Autowired
    PorteroRepository pr;
    
    public List<Portero> getByPartidoIdEquipoId(Long partidoId, Long equipoId){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo);
        
        List<Portero> res = new ArrayList<Portero>();
        
        for(Object o: pr.findAll(finalSpec)) res.add((Portero) o);
        
        return res;
    }
    
    public List<Portero> saveAll(List<Portero> porteros){
        return pr.saveAll(porteros);
    }
}
