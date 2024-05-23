/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class University_students extends Student {

    private String thesisName;
    private double thesisScore;

    public University_students() {
    }

    public University_students(String thesisName, double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public University_students(String thesisName, double thesisScore, String id, String fullName, int credit, double averageScore) {
        super(id, fullName, credit, averageScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    /*   @Override
    public String getInfo() {
        String studentInfo = "ID: " + getId() + "\n"
                + "Full Name: " + getFullName() + "\n"
                + "Credit: " + getCredit() + "\n"
                + "Average Score: " + getAverageScore() + "\n"
                + "Thesis Name: " + thesisName + "\n"
                + "Thesis Score: " + thesisScore;
        return studentInfo;
    }
     */
    public void addUniversityStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            super.Input();
            System.out.print("Enter student thesis name: ");
            String thesisName = sc.next();
            System.out.print("Enter student thesis score: ");
            double thesisScore = sc.nextDouble();
        }

    }

}
