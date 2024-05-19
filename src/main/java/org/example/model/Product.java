package org.example.model;

public class Product {


    public Product(){}
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return name;
    }

    public void setDescription(String name) {
        this.name = name;
    }
}
