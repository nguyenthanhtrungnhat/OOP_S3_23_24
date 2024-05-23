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
public class College_students extends Student {

    private double graduationExamScore;
    private Scanner sc = new Scanner(System.in);

    public College_students() {
    }

    public College_students(double graduationExamScore) {
        this.graduationExamScore = graduationExamScore;
    }

    public College_students(String id, String fullName, int credit, double averageScore, double graduationExamScore) {
        super(id, fullName, credit, averageScore);
        this.graduationExamScore = graduationExamScore;
    }

    public double getGraduationExamScore() {
        return graduationExamScore;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter graduation exam score: ");
        graduationExamScore = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Graduation exam score: " + graduationExamScore);
    }

    @Override
    public boolean CheckGraduation() {
        if (graduationExamScore < 5) {
            return false;
        }
        return super.CheckGraduation();
    }

}
