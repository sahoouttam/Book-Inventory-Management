package com.example.BookInventoryManagement.Business;

import javax.persistence.Entity;

@Entity
public class Book {
    
    private int id;
    private int inventorycount;

    public Book(int inventorycount) {
        this.inventorycount = inventorycount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInventorycount() {
        return inventorycount;
    }
    
    public void setInventorycount(int inventorycount) {
        this.inventorycount = inventorycount;
    }

}
