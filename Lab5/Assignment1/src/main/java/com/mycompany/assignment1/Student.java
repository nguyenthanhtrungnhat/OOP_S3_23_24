/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Student  {
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

    public void Input() {
        System.out.print("Enter student ID: ");
        id = sc.next();
        System.out.print("Enter student full name: ");
        fullName = sc.next();
        System.out.print("Enter student credit: ");
        credit = sc.nextInt();
        System.out.print("Enter student average score: ");
        averageScore = sc.nextDouble();
    }

    public void Output() {
        System.out.println("Student number: " + id);
        System.out.println("Student name: " + fullName);
        System.out.println("Number of credits: " + credit);
        System.out.println("Average: " + averageScore);
    }

    public boolean CheckGraduation() {
        if (credit < 100) {
            return false;
        }
        if (averageScore < 5) {
            return false;
        } else {
            return true;
        }
    }
    public static Comparator<Student> compareClass = (Student a, Student b) -> {
        if (a.getClass().toString().compareTo("class com.mycompany.assignment3_polymorphism.College_students") == 0 && b.getClass().toString().compareTo("class com.mycompany.assignment3_polymorphism.University_students") == 0) {
            return -1;
        } else if (a.getClass().toString().compareTo("class com.mycompany.assignment3_polymorphism.University_students") == 0 && b.getClass().toString().compareTo("class com.mycompany.assignment3_polymorphism.College_students") == 0) {
            return 1;
        } else {
            return a.getId().compareTo(b.getId());
        }
    };
}
