package com.example.gd_cip_be.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.gd_cip_be.entity.Jugada;

public interface JugadaRepository extends JpaRepository<Jugada, Long>, JpaSpecificationExecutor<Object> {

}
