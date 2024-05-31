/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Assignment1 {
//lab5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage m = new Manage();
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
                    m.ReadFileC();
                    break;
                case 2:
                    m.ReadFileU();
                    break;
                case 3:
                    m.deleteById();
                    m.WriteFile();
                    break;
                case 4:
                    m.printStudentList();
                    break;
                case 5:
                    m.printGraduation();
                    break;
                case 6:
                    m.sortByTypeAndCode();
                    m.WriteFile();
                    break;
                case 7:
                    m.findByName();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}