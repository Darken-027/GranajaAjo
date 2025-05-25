
package com.granjaajobueno.model;

//abstract class para crear usuarios

public abstract class interfazeProduct {
    private int id;
    private String type;
    private String name;
    private String distribution;
    private int stock;

    public interfazeProduct(int id, String type, String name, String distribution, int stock) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.distribution = distribution;
        this.stock = stock;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}