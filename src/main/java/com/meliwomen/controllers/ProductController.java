package com.meliwomen.controllers;

import com.meliwomen.dao.ProductDao;
import com.meliwomen.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by weberling on 5/8/17.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/products", method = RequestMethod.POST, produces = "application/json")
    public DeferredResult<String> save(Product product){
        DeferredResult<String> deferredResult = new DeferredResult<>();
        try {
            productDao.save(product);
            deferredResult.setResult("Product cadastrado com sucesso");
        }catch(Exception e){
            deferredResult.setErrorResult(e);
        }

        return deferredResult;

    }
}
