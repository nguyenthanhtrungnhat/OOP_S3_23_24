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
public class Teller extends Employee {

    private String stationNumber;
    private int hoursWorked;

    public Teller(String stationNumber, int hoursWorked, long salary, String fullName, int age, String occupation, String identityCardNumber) {
        super(salary, fullName, age, occupation, identityCardNumber);
        this.stationNumber = stationNumber;
        this.hoursWorked = hoursWorked;
    }

    public Teller(String stationNumber, int hoursWorked) {
        this.stationNumber = stationNumber;
        this.hoursWorked = hoursWorked;
    }

    public Teller(String stationNumber, int hoursWorked, long salary) {
        super(salary);
        this.stationNumber = stationNumber;
        this.hoursWorked = hoursWorked;
    }
    public void InputTeller()
    {
        super.InputEmployee();
        Scanner obj = new Scanner(System.in);
        System.out.print("Station number: ");
        stationNumber= obj.nextLine();
        System.out.print("Hours worked: ");
        hoursWorked = obj.nextInt();
    }
    public void OutputTeller()
    {
        super.OutputEmployee();
        System.out.print("Station number: " + stationNumber + "\nHours worked: " + hoursWorked);
    }
    @Override
    public double GetSalary() {
      if( hoursWorked>=40)
           return salary;
      return salary * 0.8;
    }

   
    
}
