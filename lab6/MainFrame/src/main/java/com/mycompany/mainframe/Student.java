/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Student {

    private String studentID;
    private String lastName;
    private String midName;
    private String firstName;
    private int yearOfBirth;
    private String gender;
    private String schoolStage;
    Scanner sc = new Scanner(System.in);

    public Student(String studentID, String lastName, String midName, String firstName, int yearOfBirth, String gender, String schoolStage) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }

    public Student() {
    }

    public String getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMidName() {
        return midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public Scanner getSc() {
        return sc;
    }

    public void Input() {
        System.out.print("Enter Id: ");
        studentID = sc.next();
        System.out.print("Enter Last Name: ");
        lastName = sc.next();
        System.out.print("Enter Mid Name: ");
        midName = sc.next();
        System.out.print("Enter First Name: ");
        firstName = sc.next();
        System.out.print("Enter Year of Birth: ");
        yearOfBirth = sc.nextInt();
        System.out.print("Enter Gender: ");
        gender = sc.next();
        System.out.print("Enter School State: ");
        schoolStage = sc.next();
    }
}
