package com.home.product.service.controller;


import com.home.product.service.entity.Product;
import com.home.product.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-service")
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
        return service.savaProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long productId){
        return service.findProductById(productId);
    }
}
