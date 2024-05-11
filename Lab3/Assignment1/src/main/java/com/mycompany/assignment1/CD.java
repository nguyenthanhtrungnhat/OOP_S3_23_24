/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    Scanner sc = new Scanner(System.in);

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

    public void addCD() {

        System.out.print("How many CDs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Id: ");
            id = sc.next();
            System.out.print("Collection: ");
            collcetion = sc.next();
            System.out.print("Type: ");
            type = sc.next();
            System.out.print("Title: ");
            title = sc.next();
            System.out.print("Price: ");
            price = sc.nextDouble();
            System.out.print("Year of release: ");
            yearOfRelease = sc.nextInt();
            CD cd = new CD(id, collcetion, type, title, price, yearOfRelease);
            list.add(cd);
        }
    }

    public void Exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

    public void sortByYor() {
        list.sort((p1, p2) -> {
            return p1.yearOfRelease - p2.yearOfRelease;

        });
    }

    public void editInformationById() {
        System.out.print("Enter Id of CD you want to edit data: ");
        String temp = sc.next();
        for (CD each : list) {
            if (each.id.equals(temp)) {
                each.collcetion = sc.next();
                each.type = sc.next();
                each.title = sc.next();
                each.price = sc.nextDouble();
                each.yearOfRelease = sc.nextInt();
                System.out.println("ID: " + each.id + " ,Collection: " + each.collcetion + " ,Type: " + each.type + " ,Title: " + each.title + " ,Price: " + each.price + " ,Year of release: " + each.yearOfRelease);
                break;
            }
        }
    }

    public void searchByType() {
        System.out.print("Enter type of CD: ");
        String findByType = sc.next();
        for (CD each : list) {
            if (each.title.equals(findByType)) {
                System.out.println("ID: " + each.id + " ,Collection: " + each.collcetion + " ,Type: " + each.type + " ,Title: " + each.title + " ,Price: " + each.price + " ,Year of release: " + each.yearOfRelease);
            }
        }
    }

    public void searchByCollection() {
        System.out.print("Enter collection of CD: ");
        String findByCollection = sc.next();
        for (CD each : list) {
            if (each.title.equals(findByCollection)) {
                System.out.println("ID: " + each.id + " ,Collection: " + each.collcetion + " ,Type: " + each.type + " ,Title: " + each.title + " ,Price: " + each.price + " ,Year of release: " + each.yearOfRelease);
            }
        }
    }

    public void searchByTitle() {
        System.out.print("Enter name of CD: ");
        String findByName = sc.next();
        for (CD each : list) {
            if (each.title.equals(findByName)) {
                System.out.println("ID: " + each.id + " ,Collection: " + each.collcetion + " ,Type: " + each.type + " ,Title: " + each.title + " ,Price: " + each.price + " ,Year of release: " + each.yearOfRelease);
            }
        }
    }

    public void deleteCdById() {
        System.out.print("Enter Id of CD you want to delete data: ");
        String temp = sc.next();
        for (CD each : list) {
            if (each.id.equals(temp)) {
                list.remove(each);
                System.out.println("Deleted CD having id: " + each.id);
                break;
            }
        }

    }

    public void DisplayAllCds() {
        System.out.println("All CDs: ");
        for (CD each : list) {
            System.out.println("ID: " + each.id + " ,Collection: " + each.collcetion + " ,Type: " + each.type + " ,Title: " + each.title + " ,Price: " + each.price + " ,Year of release: " + each.yearOfRelease);
        }
    }

}
