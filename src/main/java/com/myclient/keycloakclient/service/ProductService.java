package com.myclient.keycloakclient.service;


import com.myclient.keycloakclient.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product addProduct(Product product);
}
