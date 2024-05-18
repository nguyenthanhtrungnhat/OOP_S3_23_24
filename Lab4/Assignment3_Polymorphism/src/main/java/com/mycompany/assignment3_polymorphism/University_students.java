/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

import static com.mycompany.assignment3_polymorphism.Assignment3_Polymorphism.sc;

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

    @Override
    public String getInfo() {
        String studentInfo = "ID: " + getId() + "\n"
                + "Full Name: " + getFullName() + "\n"
                + "Credit: " + getCredit() + "\n"
                + "Average Score: " + getAverageScore() + "\n"
                + "Thesis Name: " + thesisName + "\n"
                + "Thesis Score: " + thesisScore;
        return studentInfo;
    }

    public void addUniversityStudent() {
        System.out.print("How many students?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.print("Enter student ID: ");
            String id = sc.next();
            for (Student each : vector) {
                if (each.getId().equals(id)) {
                    System.out.println("ID exixsted!");
                    break;
                }
            }
            System.out.print("Enter student full name: ");
            String fullName = sc.next();
            System.out.print("Enter student credit: ");
            int credit = sc.nextInt();
            System.out.print("Enter student average score: ");
            double averageScore = sc.nextDouble();
            System.out.print("Enter student thesis name: ");
            String thesisName = sc.next();
            System.out.print("Enter student thesis score: ");
            double thesisScore = sc.nextDouble();
            University_students u = new University_students(thesisName, thesisScore, id, fullName, credit, averageScore);
            vector.add(u);
        }
    }

}
