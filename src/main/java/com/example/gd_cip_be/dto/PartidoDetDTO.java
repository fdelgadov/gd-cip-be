package com.example.gd_cip_be.dto;

import java.util.List;

import com.example.gd_cip_be.entity.Alineacion;
import com.example.gd_cip_be.entity.Falta;
import com.example.gd_cip_be.entity.Gol;
import com.example.gd_cip_be.entity.Jugada;
import com.example.gd_cip_be.entity.Portero;
import com.example.gd_cip_be.entity.Sustitucion;
import com.example.gd_cip_be.entity.Tarjeta;

public class PartidoDetDTO {
    private List<Gol> goles;
    private List<Tarjeta> tarjetasAmarillas;
    private List<Tarjeta> tarjetasRojas;
    private List<Tarjeta> tarjetasAzules;
    private List<Falta> faltas;
    private List<Alineacion> alineacion;
    private List<Sustitucion> sustituciones;
    private List<Gol> golesContra;
    private List<Portero> portero;
    private List<Jugada> jugadasPartido;
    
    public PartidoDetDTO(List<Gol> goles, List<Tarjeta> tarjetasAmarillas, List<Tarjeta> tarjetasRojas,
            List<Tarjeta> tarjetasAzules, List<Falta> faltas, List<Alineacion> alineacion,
            List<Sustitucion> sustituciones, List<Gol> golesContra, List<Portero> portero,
            List<Jugada> jugadasPartido) {
        super();
        this.goles = goles;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.tarjetasAzules = tarjetasAzules;
        this.faltas = faltas;
        this.alineacion = alineacion;
        this.sustituciones = sustituciones;
        this.golesContra = golesContra;
        this.portero = portero;
        this.jugadasPartido = jugadasPartido;
    }

    public List<Gol> getGoles() {
        return goles;
    }

    public void setGoles(List<Gol> goles) {
        this.goles = goles;
    }

    public List<Tarjeta> getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(List<Tarjeta> tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public List<Tarjeta> getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(List<Tarjeta> tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public List<Tarjeta> getTarjetasAzules() {
        return tarjetasAzules;
    }

    public void setTarjetasAzules(List<Tarjeta> tarjetasAzules) {
        this.tarjetasAzules = tarjetasAzules;
    }

    public List<Falta> getFaltas() {
        return faltas;
    }

    public void setFaltas(List<Falta> faltas) {
        this.faltas = faltas;
    }

    public List<Alineacion> getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(List<Alineacion> alineacion) {
        this.alineacion = alineacion;
    }

    public List<Sustitucion> getSustituciones() {
        return sustituciones;
    }

    public void setSustituciones(List<Sustitucion> sustituciones) {
        this.sustituciones = sustituciones;
    }

    public List<Gol> getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(List<Gol> golesContra) {
        this.golesContra = golesContra;
    }

    public List<Portero> getPortero() {
        return portero;
    }

    public void setPortero(List<Portero> portero) {
        this.portero = portero;
    }

    public List<Jugada> getJugadasPartido() {
        return jugadasPartido;
    }

    public void setJugadasPartido(List<Jugada> jugadasPartido) {
        this.jugadasPartido = jugadasPartido;
    }
    
}
