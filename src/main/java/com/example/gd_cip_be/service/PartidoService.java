package com.example.gd_cip_be.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gd_cip_be.dto.PartidoCabDTO;
import com.example.gd_cip_be.dto.PartidoDetDTO;
import com.example.gd_cip_be.entity.Equipo;
import com.example.gd_cip_be.entity.Gol;
import com.example.gd_cip_be.entity.Partido;
import com.example.gd_cip_be.entity.repository.PartidoRepository;

@Service
public class PartidoService {
    
    @Autowired
    PartidoRepository pr;
    
    @Autowired
    GolService gs;
    
    @Autowired
    TarjetaService ts;
    
    @Autowired
    FaltaService fs;
    
    @Autowired
    AlineacionService as;
    
    @Autowired
    SustitucionService ss;
    
    @Autowired
    PorteroService ps;
    
    @Autowired
    JugadaService js;
    
    @Autowired
    EquipoService es;
    
    public Partido getById(Long id) {
        return pr.findById(id).orElseThrow(() -> new RuntimeException("Partido con id "+id+" no encontrado."));
    }
    
    public Partido save(Partido o) {
        return pr.save(o);
    }
    
    public ArrayList<PartidoCabDTO> getByFaseId(Long id) {
        ArrayList<PartidoCabDTO> res = new ArrayList<PartidoCabDTO>();
        ArrayList<Partido> aux = (ArrayList<Partido>) pr.findByFaseId(id);
        
        for(Partido o: aux) {
            Equipo eq1, eq2;
            if(o.getEquipo1Id() == null)
                eq1 = null;
            else
                eq1 = es.getById(o.getEquipo1Id());
            if(o.getEquipo2Id() == null)
                eq2 = null;
            else
                eq2 = es.getById(o.getEquipo2Id());
                        
            res.add(new PartidoCabDTO(
                o.getId(),
                o.getFaseId(), 
                eq1, 
                eq2, 
                o.getFecha(), 
                o.getTipoResultado(), 
                o.getMarcadorEquipo1(), 
                o.getMarcadorEquipo2(),
                o.getMejorJugadorId()
            ));
        }
        
        return res;
    }
    
    public PartidoDetDTO getByPartidoEquipoId(Long partidoId , Long equipoId){
        PartidoDetDTO res = null;
        
        res = new PartidoDetDTO(
                gs.getByPartidoIdEquipoId(partidoId, equipoId, 0),
                ts.getByPartidoIdEquipoId(partidoId, equipoId, 1),
                ts.getByPartidoIdEquipoId(partidoId, equipoId, 2),
                ts.getByPartidoIdEquipoId(partidoId, equipoId, 3),
                fs.getByPartidoIdEquipoId(partidoId, equipoId),
                as.getByPartidoIdEquipoId(partidoId, equipoId),
                ss.getByPartidoIdEquipoId(partidoId, equipoId),
                gs.getByPartidoIdEquipoId(partidoId, equipoId, 1),
                ps.getByPartidoIdEquipoId(partidoId, equipoId),
                js.getByPartidoIdEquipoId(partidoId, equipoId)
        );
        
        return res;
    }
    
    public PartidoDetDTO savePartidoEquipoId(PartidoDetDTO o) {
        PartidoDetDTO res = new PartidoDetDTO(
                gs.saveAll(o.getGoles()),
                ts.saveAll(o.getTarjetasAmarillas()),
                ts.saveAll(o.getTarjetasRojas()),
                ts.saveAll(o.getTarjetasAzules()),
                fs.saveAll(o.getFaltas()),
                as.saveAll(o.getAlineacion()),
                ss.saveAll(o.getSustituciones()),
                gs.saveAll(o.getGolesContra()),
                ps.saveAll(o.getPortero()),
                js.saveAll(o.getJugadasPartido())
        );
        
        return res;
    }
    
    public void deleteById(Long id) {
        pr.deleteById(id);
    }
}
