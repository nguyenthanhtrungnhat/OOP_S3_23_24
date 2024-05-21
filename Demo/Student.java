/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exexeption;

import java.time.Clock;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tai.tran
 */
public class Student {

    private String studentID;
    private String fullName;
    private int age;
    private float scoreMath;
    private float scorePhysic;
    private float scoreChemis;

    public Student() {
    }

    public Student(String studentID, String fullName, int age, float scoreMath, float scorePhysic, float scoreChemis) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.age = age;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemis = scoreChemis;
    }

    public void Input() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter student id: ");
        studentID = obj.nextLine();
        System.out.print("Enter full name: ");
        fullName = obj.nextLine();
        while (true) {
            try {

                System.out.print("Enter age: ");
                age = obj.nextInt();
                if (age <= 0 || age >= 200) {
                    throw new ExceptionStudent("Age>0 and age <200", age);
                }
                break;

            } catch (InputMismatchException ex) {
                System.out.println("Input Age (number)");
                obj.nextLine();
            } catch (ExceptionStudent ex) {
                System.err.println(ex.getErrorMess() + " - Age: " + ex.getScore());
                obj.nextLine();
            } 

        }
     
        try {
            InputScore(obj);
         } catch (ExceptionStudent ex) {
           System.out.print(ex.getErrorMess() + "- score: " + ex.getScore());
        }
       
    }

    private void InputScore(Scanner obj) throws ExceptionStudent{
        while (true) {
            try {
                System.out.print("Enter math score: ");
                scoreMath = obj.nextFloat();
                if (scoreMath < 0 || scoreMath > 10) {
                    throw new ExceptionStudent("score>=0 and score <=10",scoreMath);
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("scoreMath (number)");
                obj.nextLine();
            } 
        }
        while (true) {
            try {
                System.out.print("Enter Physic score: ");
                scorePhysic = obj.nextFloat();
                if (scorePhysic < 0 || scorePhysic > 10) {
                    throw new ExceptionStudent("scorePhysic>=0 and scorePhysic <=10",scorePhysic);
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("scorePhysic (number)");
                obj.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print(
                        "Enter chemistry score: ");
                scoreChemis = obj.nextFloat();
                if (scoreChemis < 0 || scoreChemis > 10) {
                    throw new ExceptionStudent("scoreChemis>=0 and scoreChemis <=10",scoreChemis);
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("scoreChemis (number)");
                obj.nextLine();
            } 
        }
    }

    public float CalculateAVGScore() {
        return 0;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.Input();
    }

}
