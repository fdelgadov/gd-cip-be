package com.example.gd_cip_be.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gd_cip_be.entity.ClasificacionDet;

public interface ClasificacionDetRepository extends JpaRepository<ClasificacionDet, Long> {
    List<ClasificacionDet> findAllByClaDetCabeceraId(Long id);
}
