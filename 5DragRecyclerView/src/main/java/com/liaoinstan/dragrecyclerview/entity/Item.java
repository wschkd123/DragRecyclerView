package com.liaoinstan.dragrecyclerview.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/12.
 */
public class Item implements Serializable{
    private int id;
    private String name;
    private int img;

    public Item(int id, String name, int img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }

    public Item(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
