package com.Lins.pharmacy.controllers;

import com.Lins.pharmacy.domain.Product;
import com.Lins.pharmacy.domain.ProductRepository;
import com.Lins.pharmacy.domain.ProductRequest;
import com.Lins.pharmacy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity showAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @GetMapping("/ean/{eanCode}")
    public Product getProductByEanCode(@PathVariable String eanCode){
        return service.getProductByEanCode(eanCode);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody ProductRequest data){
        Product newProduct = new Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok("Product created successfully");
    }
}
