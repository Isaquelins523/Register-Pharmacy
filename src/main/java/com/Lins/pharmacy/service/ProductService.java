package com.Lins.pharmacy.service;

import com.Lins.pharmacy.domain.Product;
import com.Lins.pharmacy.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product getProductByEanCode(String eanCode){
        return repository.findByEanCode(eanCode)
                .orElseThrow(()-> new RuntimeException("Product not found"));

    }
}
