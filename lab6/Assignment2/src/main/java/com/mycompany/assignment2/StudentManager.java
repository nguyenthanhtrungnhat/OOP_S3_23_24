/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student stu) {
        for (Student s : students) {
            if (s.getStudentID().equals(stu.getStudentID())) {
                return false; // Student ID already exists
            }
        }
        students.add(stu);
        return true;
    }

    public Student findStudentById(String studentID) {
        for (Student s : students) {
            if (s.getStudentID().equals(studentID)) {
                return s;
            }
        }
        return null; // No student found
    }

    public ArrayList<Student> getListStudent() {
        return students;
    }
    public StudentTableModel getStudentTableModel() {
        return new StudentTableModel(students);
    }
}