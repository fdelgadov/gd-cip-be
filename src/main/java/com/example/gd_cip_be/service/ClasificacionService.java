package com.example.gd_cip_be.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.dto.ClasificacionPosDTO;
import com.example.gd_cip_be.dto.ClasificacionPosDetDTO;
import com.example.gd_cip_be.entity.ClasificacionCab;
import com.example.gd_cip_be.entity.ClasificacionDet;
import com.example.gd_cip_be.entity.repository.ClasificacionCabRepository;
import com.example.gd_cip_be.entity.repository.ClasificacionDetRepository;
import com.example.gd_cip_be.enums.Criterio;

@Service
public class ClasificacionService {
    
    @Autowired
    ClasificacionDetRepository cdr;
    
    @Autowired
    ClasificacionCabRepository ccr;
    
    List<Criterio> criterios;
    
    public ClasificacionService() {
        criterios = new ArrayList<Criterio>();
                
        criterios.add(Criterio.PUNTOS);
        criterios.add(Criterio.VICTORIAS);
        criterios.add(Criterio.DIFERENCIA_PUNTOS);
        criterios.add(Criterio.GOLES_FAVOR);
        criterios.add(Criterio.GOLES_CONTRA);
        criterios.add(Criterio.APROVECHAMIENTO);
    }
    
    public ClasificacionPosDTO getClasificacionPosById(Long id) {
        ClasificacionPosDTO res = null;
        
        ClasificacionCab cabecera = ccr.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró cabecera con id "+id+""));
                
        List<ClasificacionDet> detalles =  cdr.findAllByClaDetCabeceraId(id);
        detalles = ordenarPorCriterioRecursivo(detalles, 0);
        
        List<ClasificacionPosDetDTO> detalle = ordenarPorCriterio(detalles);
        
        res = new ClasificacionPosDTO(cabecera, detalle);
        
        return res;
    }
    
    public List<ClasificacionPosDetDTO> ordenarPorCriterio(List<ClasificacionDet> lista){
        List<ClasificacionPosDetDTO> res = new ArrayList<ClasificacionPosDetDTO>();
        
        int j = 1;
        for(int i=lista.size()-1; i>=0; i--) {
            res.add(new ClasificacionPosDetDTO(j, lista.get(i)));
            j++;
        }
        
        return res;
    }
    
    /*
    ordenarPorCriterioRecursivo(lista, criterio): Lista
        res: Array
        aux: Array
        
        estado: SIN_COPIA
        
        for i in (0, lista.size-1):
            x = lista[i]
            if SIN_COPIA:
                if x == lista[i+1]:
                    aux.add(x)
                    estado = EN_COPIA
                else:
                    res.add(x)

            if EN_COPIA:
                if x == lista[i-1]:
                    aux.add(x)
                else:
                    aux = ordenarPorCriterioRecursivo(aux, criterio+1)
                    
                    for j in aux:
                        res.add(j)
                        
                    aux = Array
                    res.add(x)
                    estado = SIN_COPIA
                    
        if SIN_COPIA:
            res.add(lista[-1])
        else:
            if lista[-1] == lista[-2]:
                aux.add(lista[-1])
                aux = ordenarPorCriterioRecursivo(aux, criterio+1)
                for j in aux:
                    res.add(j)
            else:
                aux = ordenarPorCriterioRecursivo(aux, criterio+1)
                for j in aux:
                    res.add(j)
                res.add(lista[-1])
                
        return res;
     */
    public List<ClasificacionDet> ordenarPorCriterioRecursivo(List<ClasificacionDet> lista, int idxCriterio){
        Criterio criterio = criterios.get(idxCriterio);
        
        List<ClasificacionDet> ordenado = new ArrayList<ClasificacionDet>(lista);
        ordenado.sort((o1, o2) -> {
            Integer a = o1.getValueByCriterio(criterio);
            Integer b = o2.getValueByCriterio(criterio);
            
            return a.compareTo(b);
        });
        List<ClasificacionDet> res = new ArrayList<ClasificacionDet>();
        List<ClasificacionDet> aux = new ArrayList<ClasificacionDet>();
        
        boolean enCopia = false;
        
        for(int i=0; i<ordenado.size()-1; i++) {
            int value = ordenado.get(i).getValueByCriterio(criterio);
            
            if(!enCopia) {
                if(value == ordenado.get(i+1).getValueByCriterio(criterio)) {
                    aux.add(ordenado.get(i));
                    enCopia = true;
                }
                else {
                    res.add(ordenado.get(i));
                }
            }
            else {
                if(value == ordenado.get(i-1).getValueByCriterio(criterio)) {
                    aux.add(ordenado.get(i));
                }
                else {
                    aux = ordenarPorCriterioRecursivo(aux, idxCriterio+1);
                    
                    for(ClasificacionDet c: aux) {
                        res.add(c);
                    }
                    
                    aux = new ArrayList<ClasificacionDet>(); 
                    res.add(ordenado.get(i));
                    enCopia = false;
                }
            }
        }
        
        if(!enCopia) {
            res.add(ordenado.getLast());
        }
        else {
            if(ordenado.getLast() == ordenado.get(ordenado.size()-2)) {
                aux.add(ordenado.getLast());
                aux = ordenarPorCriterioRecursivo(aux, idxCriterio+1);
                
                for(ClasificacionDet c: aux) {
                    res.add(c);
                }
            }
            else {
                aux = ordenarPorCriterioRecursivo(aux, idxCriterio+1);
                
                for(ClasificacionDet c: aux) {
                    res.add(c);
                }
                
                res.add(ordenado.getLast());
            }
        }
        
        return res;
    }
}
