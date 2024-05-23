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
    private Scanner sc = new Scanner(System.in);

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

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter thesis name: ");
        thesisName = sc.next();
        System.out.print("Enter thesis score: ");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Thesis name: " + thesisName);
        System.out.println("Thesis score: " + thesisScore);
    }

    @Override
    public boolean CheckGraduation() {
        if (thesisScore < 5) {
            return false;
        }
        return super.CheckGraduation();
    }

}
