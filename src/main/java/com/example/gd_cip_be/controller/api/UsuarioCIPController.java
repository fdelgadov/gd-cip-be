package com.example.gd_cip_be.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gd_cip_be.entity.UsuarioCIP;
import com.example.gd_cip_be.service.UsuarioCIPService;

@RestController
@RequestMapping(path = "usuarioCIP")
public class UsuarioCIPController {
    @Autowired
    UsuarioCIPService s;
    
    @GetMapping(path = "/{cip}")
    public UsuarioCIP getByCIP(@PathVariable("cip") String cip) {
        return s.getByCIP(cip);
    }
}
