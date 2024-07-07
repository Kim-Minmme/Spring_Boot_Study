package com.minme.spring_boot_study.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private Long id;
    private String title;
    private Integer price;

    public Item() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Integer getPrice() {
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
}
