package com.example.gd_cip_be.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.gd_cip_be.entity.Gol;

public interface GolRepository extends JpaRepository<Gol, Long>, JpaSpecificationExecutor<Object> {

}
