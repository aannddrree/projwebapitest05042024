package org.example.model;

public class Questions {

    public Questions(){}

    public  Questions(int id, String description){
        this.id = id;
        this.description = description;
    }

    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
