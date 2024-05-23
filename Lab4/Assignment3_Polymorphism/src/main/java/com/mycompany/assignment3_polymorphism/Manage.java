/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_polymorphism;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Dell
 */
public class Manage {

    private Vector<Student> vector = new Vector<>();
    private Scanner sc = new Scanner(System.in);

    public Manage() {
    }

    public void addUni() {
        University_students university_students = new University_students();
        university_students.Input();
        vector.add(university_students);
    }

    public void addCol() {
        College_students college_students = new College_students();
        college_students.Input();
        vector.add(college_students);
    }

    public void deleteById() {

        System.out.print("Enter ID to delete: ");
        String idToDelete = sc.next();
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).getId().equals(idToDelete)) {
                vector.remove(i);
                System.out.println("Student with ID " + idToDelete + " has been removed.");

            }
        }
    }

    public void printStudentList() {
        for (int i = 0; i < vector.size(); i++) {
            vector.get(i).Output();
        }
    }

    public void sortByTypeAndCode() {
        vector.sort((s1, s2) -> {
            return s1.getId().compareTo(s2.getId());
        });
    }

    public void printGraduation() {
        int count = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).CheckGraduation()) {
                vector.get(i).Output();
                count++;
            }
        }
        System.out.println("Number of eligible student: " + count);
    }

    public void findName() {
        System.out.println("Enter name: ");
        String findName = sc.next();
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).getFullName().equals(findName)) {
                vector.get(i).Output();
            }
        }
    }
}
