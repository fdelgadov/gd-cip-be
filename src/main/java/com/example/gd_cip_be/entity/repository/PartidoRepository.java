package com.example.gd_cip_be.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.gd_cip_be.entity.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Long> {
    List<Partido> findByFaseId(Long id);
}
