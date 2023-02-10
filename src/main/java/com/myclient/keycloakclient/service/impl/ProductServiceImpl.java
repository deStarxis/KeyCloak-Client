package com.myclient.keycloakclient.service.impl;

import com.myclient.keycloakclient.entity.Product;
import com.myclient.keycloakclient.repository.ProductRepository;
import com.myclient.keycloakclient.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
