/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

/**
 *
 * @author Dell
 */
abstract class Student {

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

    

}
