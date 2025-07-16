package com.platzi.pizza.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.platzi.pizza.persistence.entity.PizzaEntity;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
    
}
