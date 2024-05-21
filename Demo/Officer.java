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
public class Officer extends Employee {
    private String numberOffice;

    public Officer(String numberOffice, long salary, String fullName, int age, String occupation, String identityCardNumber) {
        super(salary, fullName, age, occupation, identityCardNumber);
        this.numberOffice = numberOffice;
    }

    public Officer(String numberOffice) {
        this.numberOffice = numberOffice;
    }

    public Officer(String numberOffice, long salary) {
        super(salary);
        this.numberOffice = numberOffice;
    }
    public void InputOfficer()
    {
        super.InputEmployee();
        Scanner obj = new Scanner(System.in);
        obj.nextLine();
        numberOffice = obj.nextLine();
    }
    public void OutputOfficer()
    {
        super.OutputEmployee();
        System.out.print("Number officer: " + numberOffice);
    }
    @Override
    public double GetSalary()
    {
        return salary;
    }
}
