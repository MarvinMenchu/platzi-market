package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.Optional;
import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProductos(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
