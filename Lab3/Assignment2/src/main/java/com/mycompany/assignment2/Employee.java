/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author Dell
 */
abstract class Employee {

    private String employeeId;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;

    public Employee() {

    }

    public Employee(String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public abstract float calculatePayment();

    public abstract String getInfo();

}
