package com.home.product.service.service;

import com.home.product.service.entity.Product;
import com.home.product.service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product savaProduct(Product product) {
        return repository.save(product);
    }

    public Product findProductById(Long productId) {
        return repository.findByProductId(productId);

    }
}
