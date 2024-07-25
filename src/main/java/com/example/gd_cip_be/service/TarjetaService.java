package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.entity.Tarjeta;
import com.example.gd_cip_be.entity.repository.TarjetaRepository;
import com.example.gd_cip_be.specifications.PartidoDetSpecifications;

@Service
public class TarjetaService {
    
    @Autowired
    TarjetaRepository tr;
    
    public List<Tarjeta> getByPartidoIdEquipoId(Long partidoId, Long equipoId, Integer c){
        Specification<Object> isInPartido = PartidoDetSpecifications.isInPartido(partidoId);
        Specification<Object> isInEquipo = PartidoDetSpecifications.isInEquipo(equipoId);
        Specification<Object> isColor = PartidoDetSpecifications.isColor(c);
        
        Specification<Object> finalSpec = Specification.where(isInPartido).and(isInEquipo).and(isColor);
        
        List<Tarjeta> res = new ArrayList<Tarjeta>();
        
        for(Object o: tr.findAll(finalSpec)) res.add((Tarjeta) o);
        
        return res;
    }
    
    public List<Tarjeta> saveAll(List<Tarjeta> tarjetas){
        return tr.saveAll(tarjetas);
    }
    
    public void deleteById(Long id) {
        tr.deleteById(id);
    }
}
