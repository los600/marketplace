package com.spike.marketplace.controller;

import com.spike.marketplace.model.Product;
import com.spike.marketplace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")


public class ProductController {
    @Autowired
    private ProductService productService;      //Para arreglar el error tuve que implementar la annotation @Service en la Implementacion del Servicio "ProducrServiceImp"

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New product is added";
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
