package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Jugada;
import com.example.gd_cip_be.entity.repository.JugadaRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class JugadaService {
    
    @Autowired
    JugadaRepository jr;
    
    public List<Jugada> getByPartidoIdEquipoId(Long partidoId, Long equipoId){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo);
        
        List<Jugada> res = new ArrayList<Jugada>();
        
        for(Object o: jr.findAll(finalSpec)) res.add((Jugada) o);
        
        return res;
    }
    
    public List<Jugada> saveAll(List<Jugada> jugadas){
        return jr.saveAll(jugadas);
    }
}
