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
public class Customer extends Person{
    private double creditRating;

    public Customer(double creditRating, String fullName, int age, String occupation, String identityCardNumber) {
        super(fullName, age, occupation, identityCardNumber);
        this.creditRating = creditRating;
    }

    public Customer() {
    }

    public Customer(double creditRating) {
        this.creditRating = creditRating;
    }
    public void InputCustomer()
    {
        super.InputPerson();
        Scanner obj = new Scanner(System.in);
        System.out.println("Credit rating : ");
        creditRating= obj.nextDouble();
    }
    public void OutputCustomer()
    {
        super.OutputPerson();
        System.out.println("\nCredit rating: " + creditRating);
    }
   
}
