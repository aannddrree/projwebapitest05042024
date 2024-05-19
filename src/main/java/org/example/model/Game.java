package org.example.model;

public class Game {

    public  Game(){}

    public  Game(int id, String descricao, String categoria){
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    private int id;
    private String descricao;
    private String categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
