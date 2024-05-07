/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3_managesalary;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Employee {

    private String employeeCode;
    private String fullName;
    private int yearOfService;
    private double salaryCoefficient;
    private double basicSalary;
    private double salary;
    private List<Employee> list = new ArrayList<>();

    public Employee() {
    }

    public Employee(String employeeCode, String fullName, int yearOfService, double salaryCoefficient, double basicSalary, double salary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.yearOfService = yearOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
        this.salary = salary;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nhan vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma nhan vien: ");
            employeeCode = sc.next();
            System.out.print("Nhap ho va ten nhan vien: ");
            fullName = sc.next();

            System.out.print("Nhap so nam lam viec: ");
            yearOfService = sc.nextInt();
            System.out.print("Nhap he so luong: ");
            salaryCoefficient = sc.nextDouble();
            System.out.print("Nhap luong co ban: ");
            basicSalary = sc.nextDouble();
            salary = basicSalary * salaryCoefficient;
            Employee employee = new Employee(employeeCode, fullName, yearOfService, salaryCoefficient, basicSalary, salary);
            list.add(employee);
            list.sort((p1, p2) -> {
                return Double.compare(p2.salary, p1.salary);
            });
        }

    }

    public void Output() {
        System.out.println("Danh sach luong: ");
        double max = list.get(0).salary;
        for (int i = 0; i < list.size(); i++) {
           System.out.print("Luong nhan vien " + list.get(i).fullName +" MSNV "+list.get(i).employeeCode+ ": ");
            System.out.println(list.get(i).salary);
        }
        System.out.println("Nhung nhan vien co luong cao nhat la: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).salary != max) {
                break;
            }
            System.out.print("Luong nhan vien " + list.get(i).fullName +" MSNV "+list.get(i).employeeCode+ ": ");
            System.out.println(list.get(i).salary);
            max = list.get(i).salary;
        }
    }
}
