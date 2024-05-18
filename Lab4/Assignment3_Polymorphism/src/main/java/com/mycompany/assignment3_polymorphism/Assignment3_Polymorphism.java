/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment3_polymorphism;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Dell
 */
public class Assignment3_Polymorphism {

    public static Scanner sc = new Scanner(System.in);
    Vector<Student> vector = new Vector();

    public static void main(String[] args) {
        University_students university_students = new University_students();

        while (true) {
            System.out.println("Menu:");
            System.out.println(" 1. Add a new college student.");
            System.out.println("2. Add a new university student.");
            System.out.println("3. Remove a student from the list with the student code entered from the keyboard.");
            System.out.println("4. Print student list.");
            System.out.println("5. Print the list of students eligible for graduation and indicate the number of eligible students.");
            System.out.println("6. Sort the student list ascending by Student type (College, university) and student code");
            System.out.println("7. Find student list by student's full name (Contains).");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addCollegeStudent();
                    break;
                case 2:
                    university_students.addUniversityStudent();
                    break;
                case 3:
                    deleteById();
                    break;
                case 4:
                    printAllStudent();
                    break;
                case 5:
                    printGraduation();
                    break;
                case 6:
                    sortByTypeAndCode();
                    break;
                case 7:
                    findByName();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }

    public void addCollegeStudent() {
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

    public static void deleteById() {

    }

    public static void printAllStudent() {

    }

    public static void printGraduation() {

    }

    public static void sortByTypeAndCode() {

    }

    public static void findByName() {

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
