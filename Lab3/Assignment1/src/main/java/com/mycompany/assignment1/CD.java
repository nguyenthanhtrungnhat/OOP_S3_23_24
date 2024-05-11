/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class CD {

    private String id;
    private String collcetion;
    private String type;
    private String title;
    private double price;
    private int yearOfRelease;
    private List<CD> list = new ArrayList<>();

    public CD() {
    }

    public CD(String id, String collcetion, String type, String title, double price, int yearOfRelease) {
        this.id = id;
        this.collcetion = collcetion;
        this.type = type;
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }

   

    public void Input() {
        System.out.print("How many CDs: ");
    }

    public void Output() {

    }

}
