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
public abstract class Employee extends Person {
    protected long salary;

    public Employee(long salary, String fullName, int age, String occupation, String identityCardNumber) {
        super(fullName, age, occupation, identityCardNumber);
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(long salary) {
        this.salary = salary;
    }
    public void InputEmployee()
    {
        super.InputPerson();
        Scanner obj = new Scanner(System.in);
        salary= obj.nextLong();
    }
    public void OutputEmployee()
    {
        super.OutputPerson();
        System.out.println("Salary: " + salary);
    }
    public abstract double GetSalary();
    
}
