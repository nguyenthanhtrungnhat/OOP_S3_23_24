/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.*;

/**
 *
 * @author Dell
 */
public class ParttimeEmployee extends Employee {

    Scanner sc = new Scanner(System.in);
    private float workingHours;
    private float payRate;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(float workingHours, float payRate) {
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    public ParttimeEmployee(float workingHours, float payRate, String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeId, employeeName, yearOfBirth, address, phone);
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    @Override
    public float calculatePayment() {
        return workingHours * payRate;
    }

    @Override
    public String getInfo() {
        String employeeInfo = "Employee ID: " + getEmployeeId() + "\n"
                + "Employee Name: " + getEmployeeName() + "\n"
                + "Year of Birth: " + getYearOfBirth() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Phone: " + getPhone() + "\n"
                + "Working Hours: " + workingHours + "\n"
                + "Pay Rate: " + payRate + "\n"
                + "Payment: " + calculatePayment();
        return employeeInfo;
    }

}
