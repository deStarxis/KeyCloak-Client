package com.myclient.keycloakclient.controller;

import com.myclient.keycloakclient.entity.Product;
import com.myclient.keycloakclient.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @PostMapping("/admin/products")
//    @RolesAllowed("admin")
    public ResponseEntity<Product> saveUser(Product product, Principal p){
        System.out.println(product + "; UserId: " + p.getName());
        return ResponseEntity.ok(productRepository.save(product));
    }

    @GetMapping("/user/products")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(productRepository.findAll());
    }
}
