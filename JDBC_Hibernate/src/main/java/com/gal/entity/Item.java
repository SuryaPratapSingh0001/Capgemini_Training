package com.gal.entity;

import jakarta.persistence.*;

@Entity
@Table(name="item")
public class Item {

    @Id
    private int itemid;

    private String name;

    private String type;

    public Item() {}

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}