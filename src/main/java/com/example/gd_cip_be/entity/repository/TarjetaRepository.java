package com.example.gd_cip_be.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.gd_cip_be.entity.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long>, JpaSpecificationExecutor<Object> {

}
