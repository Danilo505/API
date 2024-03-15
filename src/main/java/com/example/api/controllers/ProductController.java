package com.example.api.controllers;

import com.example.api.domain.product.Product;
import com.example.api.domain.product.ProductRepository;
import com.example.api.domain.product.RequestProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){

        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity<Product> registerProduct(@RequestBody @Validated RequestProduct data) {
        var product = new Product(data);
        repository.save(product);
        System.out.println(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}
