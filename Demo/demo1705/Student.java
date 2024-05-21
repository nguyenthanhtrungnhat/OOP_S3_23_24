/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1705;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Phan Thao
 */
public class Student {

    private String id;
    private String name;
    private int age;
    private float scoreMath;
    private float scorePhysic;
    private float scoreChemis;

    public Student() {

    }

    public Student(String id, String name, int age, float scoreMath, float scorePhysic, float scoreChemis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemis = scoreChemis;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();

        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter Age: ");
                this.age = scanner.nextInt();
                if (this.age <= 0 || this.age >= 200) {
                    throw new Exception();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception ex) {
                System.out.println("Age must be > 0 and < 200.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter Math Score: ");
                this.scoreMath = scanner.nextFloat();
                if (this.scoreMath < 0 || this.scoreMath > 100) {
                    throw new Exception();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float for Math score.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception ex) {
                System.out.println("Math score must be between 0 and 100.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter Physics Score: ");
                this.scorePhysic = scanner.nextFloat();
                if (this.scorePhysic < 0 || this.scorePhysic > 100) {
                    throw new Exception();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float for Physics score.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception ex) {
                System.out.println("Physics score must be between 0 and 100.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter Chemistry Score: ");
                this.scoreChemis = scanner.nextFloat();
                if (this.scoreChemis < 0 || this.scoreChemis > 100) {
                    throw new Exception();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float for Chemistry score.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception ex) {
                System.out.println("Chemistry score must be between 0 and 100.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

    public float CalculateAverage() {
        return (this.scoreMath + this.scorePhysic + this.scoreChemis) / 3;
    }

    public void Display() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Math Score: " + this.scoreMath);
        System.out.println("Physics Score: " + this.scorePhysic);
        System.out.println("Chemistry Score: " + this.scoreChemis);
        System.out.println("Average Score: " + this.CalculateAverage());
    }
}
