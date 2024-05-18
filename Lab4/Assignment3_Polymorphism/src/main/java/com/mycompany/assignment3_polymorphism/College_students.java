/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

/**
 *
 * @author Dell
 */
public class College_students extends Student {

    private double graduationExamScore;

    public College_students() {
    }

    public College_students(double graduationExamScore) {
        this.graduationExamScore = graduationExamScore;
    }

    public College_students(double graduationExamScore, String id, String fullName, int credit, double averageScore) {
        super(id, fullName, credit, averageScore);
        this.graduationExamScore = graduationExamScore;
    }

    public double getGraduationExamScore() {
        return graduationExamScore;
    }

    @Override
    public String getInfo() {
        // Assuming the Student class has the appropriate getters
        String studentInfo = "ID: " + getId() + "\n"
                + "Full Name: " + getFullName() + "\n"
                + "Credit: " + getCredit() + "\n"
                + "Average Score: " + getAverageScore() + "\n"
                + "Graduation Exam Score: " + graduationExamScore;
        return studentInfo;
    }

}
