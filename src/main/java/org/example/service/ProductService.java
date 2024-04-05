package org.example.service;

import org.example.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> lst = new ArrayList<>();

    public List<Product> getProduct(){

        lst.add(new Product(1,"Tijolos"));
        lst.add(new Product(2,"Cimento"));
        lst.add(new Product(3,"Areia"));
        lst.add(new Product(4,"Pedra britada"));
        lst.add(new Product(5,"Argamassa"));
        lst.add(new Product(6,"Telhas"));
        lst.add(new Product(7,"Tinta para parede"));
        lst.add(new Product(8,"Tinta para madeira"));
        lst.add(new Product(9,"Tinta para metal"));
        lst.add(new Product(10,"Madeira serrada"));
        lst.add(new Product(11,"Ferragens (parafusos, pregos, dobradiças)"));
        lst.add(new Product(12,"Pisos cerâmicos"));

        return lst;
    }
}
