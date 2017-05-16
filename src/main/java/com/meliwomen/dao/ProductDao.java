package com.meliwomen.dao;

import com.meliwomen.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by weberling on 5/8/17.
 */
@Repository
@javax.transaction.Transactional
public interface ProductDao extends CrudRepository<Product, Long> {

    public Product findById(int id);

}
