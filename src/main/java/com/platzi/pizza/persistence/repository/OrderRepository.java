package com.platzi.pizza.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.platzi.pizza.persistence.entity.OrderEntity;

public interface OrderRepository extends ListCrudRepository<OrderEntity,Integer>{
    
}
