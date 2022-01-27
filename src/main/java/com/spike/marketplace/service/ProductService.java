package com.spike.marketplace.service;

import com.spike.marketplace.model.Product;
import java.util.List;


public interface ProductService {
    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public Product get(Integer id);

    public Product save (Product product);

    public void delete (Integer id);
}
