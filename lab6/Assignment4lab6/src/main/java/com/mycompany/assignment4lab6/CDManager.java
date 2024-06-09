/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4lab6;

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

}
