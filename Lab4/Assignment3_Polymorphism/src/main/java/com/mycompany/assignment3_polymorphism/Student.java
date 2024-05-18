/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

import static com.mycompany.assignment3_polymorphism.Assignment3_Polymorphism.sc;
import java.util.Vector;

/**
 *
 * @author Dell
 */
abstract class Student {

    public Vector<Student> vector = new Vector();
    private String id;
    private String fullName;
    private int credit;
    private double averageScore;

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

    
}
