/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("How many CDs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("");
            id = sc.next();
            collcetion = sc.next();
            type = sc.next();
            title = sc.next();
            price = sc.nextDouble();
            yearOfRelease = sc.nextInt();
            CD cd = new CD(id, collcetion, type, title, price, yearOfRelease);
            list.add(cd);
        }
    }

    public void Exit() {
        
    }

    public void sortByYor() {

    }

    public void editInformationById() {

    }

    public void searchByType() {

    }

    public void searchByCollection() {

    }

    public void searchByTitle() {

    }

    public void deleteCdById() {

    }

    public void DisplayAllCds() {
        for (CD each : list) {
            System.out.println("All CDs: ");
            System.out.println(each.id + " " + each.collcetion + " " + each.type + " " + each.title + " " + each.price + " " + each.yearOfRelease);
        }
    }

}
