/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abcbank;

import java.util.Scanner;

/**
 *
 * @author tai.tran
 */
public class Person {
    private String fullName;
    private int age;
    private String occupation;
    private String identityCardNumber;

    public Person(String fullName, int age, String occupation, String identityCardNumber) {
        this.fullName = fullName;
        this.age = age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;
    }

    public Person() {
    }
    public void InputPerson()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Fullname: ");
        fullName = obj.nextLine();
        System.out.println("Age: ");
        age = obj.nextInt();
        obj.nextLine();
        System.out.println("Occupation: ");
        occupation = obj.nextLine();
        System.out.println("Identity Card Number: ");
        identityCardNumber = obj.nextLine();
    }
    public void OutputPerson() //ToString()
    {
        System.out.println("Name: " + fullName + "\nAge: " + age + "\nOccupation: " + occupation
        + "\n Id card: " + identityCardNumber);
    }
    
}
