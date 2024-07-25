package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Alineacion;
import com.example.gd_cip_be.entity.repository.AlineacionRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class AlineacionService {
    
    @Autowired
    AlineacionRepository ar;
    
    public List<Alineacion> getByPartidoIdEquipoId(Long partidoId, Long equipoId){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo);
        
        List<Alineacion> res = new ArrayList<Alineacion>();
        
        for(Object o: ar.findAll(finalSpec)) res.add((Alineacion) o);
        
        return res;
    }
    
    public List<Alineacion> saveAll(List<Alineacion> alineaciones){
        return ar.saveAll(alineaciones);
    }
    
    public void deleteById(Long id) {
        ar.deleteById(id);
    }
}
