package com.example.gd_cip_be.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.dto.PartidoCabDTO;
import com.example.gd_cip_be.dto.PartidoDetDTO;
import com.example.gd_cip_be.entity.Partido;
import com.example.gd_cip_be.service.PartidoService;

@RestController
@RequestMapping(path = "partido")
public class PartidoController {

    @Autowired
    PartidoService ps;
    
    @GetMapping
    public List<PartidoCabDTO> getByFaseId(@RequestParam Long faseId){
        return ps.getByFaseId(faseId);
    }
    
    @PostMapping
    public Partido save(@RequestBody Partido partido) {
        return ps.save(partido);
    }
    
    @GetMapping(path = "/detalle")
    public PartidoDetDTO getByPartidoIdFaseId(@RequestParam Long partidoId, @RequestParam Long equipoId){
        return ps.getByPartidoEquipoId(partidoId, equipoId);
    }
    
    @PostMapping(path = "/detalle")
    public PartidoDetDTO savePartidoEquipoId(@RequestBody PartidoDetDTO o) {
        return ps.savePartidoEquipoId(o);
    }
    
    @DeleteMapping(path = "/{id}")
    public void deleteById(Long id) {
        ps.deleteById(id);
    }
}
