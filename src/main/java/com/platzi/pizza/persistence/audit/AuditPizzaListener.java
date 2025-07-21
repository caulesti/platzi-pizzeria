package com.platzi.pizza.persistence.audit;

import org.springframework.util.SerializationUtils;

import com.platzi.pizza.persistence.entity.PizzaEntity;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PreRemove;

public class AuditPizzaListener {
    private PizzaEntity currentEntity;
    
    @PostLoad
    public void postLoad(PizzaEntity entity) {
        System.out.println("POST LOAD");
        this.currentEntity = SerializationUtils.clone(entity);
    }

    @PostPersist
    @PostUpdate
    public void onPostPersist(PizzaEntity entity) {
        System.out.println("POST PERSIST OR UPDATE");
        System.out.println("OLD VALUE: " + currentEntity);
        System.out.println("NEW VALUE: " + entity.toString());
    }

    @PreRemove
    public void onPreDelete(PizzaEntity entity) {
        System.out.println(entity.toString());
    }
}
