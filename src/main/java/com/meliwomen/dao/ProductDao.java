package com.meliwomen.dao;

import com.meliwomen.domain.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by weberling on 5/8/17.
 */
@Repository
public class ProductDao {

    @PersistenceContext
    private EntityManager manager;

    public void save(Product product){
        manager.persist(product);
    }
}
