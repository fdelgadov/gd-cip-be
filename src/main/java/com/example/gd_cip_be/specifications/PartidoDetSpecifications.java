package com.example.gd_cip_be.specifications;

import org.springframework.data.jpa.domain.Specification;

public class PartidoDetSpecifications {
    
    public static Specification<Object> isInPartido(Long partidoId){
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.equal(root.get("partidoId"), partidoId);
    }
    
    public static Specification<Object> isInEquipo(Long equipoId){
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.equal(root.get("equipoId"), equipoId);
    }
    
    public static Specification<Object> isColor(Integer colorId){
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.equal(root.get("colorId"), colorId);
    }
    
    public static Specification<Object> isEnContra(Integer v){
        return (root, query, criteriaBuilder) ->
            criteriaBuilder.equal(root.get("enContra"), v);
    }
}
