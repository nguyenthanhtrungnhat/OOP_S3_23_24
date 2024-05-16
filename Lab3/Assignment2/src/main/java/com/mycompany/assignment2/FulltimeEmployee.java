/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author Dell
 */
public class FulltimeEmployee extends Employee {

    private float salary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(float salary) {
        this.salary = salary;
    }

    public FulltimeEmployee(float salary, String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeId, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    @Override
    public float calculatePayment() {
        return salary;
    }

    @Override
    public String getInfo() {
        String employeeInfo = "Employee ID: " + getEmployeeId() + "\n"
                + "Employee Name: " + getEmployeeName() + "\n"
                + "Year of Birth: " + getYearOfBirth() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Phone: " + getPhone() + "\n"
                + "Salary: " + salary;
        return employeeInfo;
    }

}
