/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class CDManager {

    private String id;
    private String title;
    private String collection;
    private String type;
    private double price;
    private int yearOfRelease;
    private List<CDManager> list = new ArrayList<>();

    public CDManager() {
    }

    public CDManager(String id, String title, String collection, String type, double price, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.collection = collection;
        this.type = type;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCollection() {
        return collection;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<CDManager> getList() {
        return list;
    }

  

    public StringBuilder Show() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).id).append(" ").append(list.get(i).title).append(" ").append(list.get(i).collection).append(" ").append(list.get(i).type).append(" ").append(list.get(i).price).append(" ").append(list.get(i).yearOfRelease).append("\n");
        }
        return sb;
    }
}
