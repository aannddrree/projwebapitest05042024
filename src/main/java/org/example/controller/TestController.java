package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello turma UNIARA!";
    }

    @CrossOrigin
    @RequestMapping("/list")
    public List<Product> getProduct(){
        return new ProductService().getProduct();
    }

    @CrossOrigin
    @RequestMapping("/add")
    public Product add(Product product){
        return new ProductService().add(product);
    }
}

