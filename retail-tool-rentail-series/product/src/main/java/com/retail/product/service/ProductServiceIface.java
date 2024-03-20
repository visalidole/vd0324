package com.retail.product.service;

import com.retail.product.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public interface ProductServiceIface {

    /**
     * @return a list of products matching the query parameters
     *
     */
    @GetMapping("/products")
    ResponseEntity<List<Product>> getProducts(
            @RequestParam(name="type") Optional<String> type,
            @RequestParam String query);

    @GetMapping("/rentaltool")
    ResponseEntity<List<Product>> getRentalTool(
            @RequestParam String code);

    @PutMapping("/products")
    ResponseEntity<List<Product>> addProduct(
            @RequestBody Product tool);

    @PostMapping("/products")
    ResponseEntity<List<Product>> updateProduct(
            @RequestBody Product tool);

    @DeleteMapping("/products")
    ResponseEntity<List<Product>> deleteProduct(
            @RequestParam Product tool);


}
