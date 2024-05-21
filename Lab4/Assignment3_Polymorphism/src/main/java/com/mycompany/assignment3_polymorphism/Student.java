/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Dell
 */
abstract class Student {

    private String id;
    private String fullName;
    private int credit;
    private double averageScore;
    private Scanner sc = new Scanner(System.in);
   

    public Student() {
    }

    public Student(String id, String fullName, int credit, double averageScore) {
        this.id = id;
        this.fullName = fullName;
        this.credit = credit;
        this.averageScore = averageScore;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCredit() {
        return credit;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public abstract String getInfo();

    public void Input() {

        System.out.print("Enter student ID: ");
        String id = sc.next();
        System.out.print("Enter student full name: ");
        String fullName = sc.next();
        System.out.print("Enter student credit: ");
        int credit = sc.nextInt();
        System.out.print("Enter student average score: ");
        double averageScore = sc.nextDouble();
    }

    

    

}