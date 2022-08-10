package com.example.phamducduy.model;

import com.example.phamducduy.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductModel{
    private List<Product> products;

    public void InMemoryProduct(){
        products = new ArrayList<>();
        products.add(new Product(1, "Áo", 5, 1000, 1));
        products.add(new Product(1, "Quần", 6, 2000, 1));
        products.add(new Product(1, "Giày", 7, 3000, 1));
        products.add(new Product(1, "Dép", 8, 4000, 1));
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(String id) {
        return null;
    }

    @Override
    public Product update(String id, Product updateProduct) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
