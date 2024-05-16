/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment2;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Assignment2 {

    private static ArrayList<FulltimeEmployee> fullTimeEmployees = new ArrayList<>();
    private static ArrayList<ParttimeEmployee> partTimeEmployees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Full-time Employee");
            System.out.println("2. Add Part-time Employee");
            System.out.println("3. Show all Full-time Employees");
            System.out.println("4. Show all Part-time Employees");
            System.out.println("5. Show all Employees");
            System.out.println("6. Search Employee by Id");
            System.out.println("7. Delete Employee by Id");
            System.out.println("8. Edit Employee information by Id");
            System.out.println("9. Search Employee by payment");
            System.out.println("10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment.");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:

                    addFullTimeEmployee();

                    break;
                case 2:

                    addPartTimeEmployee();

                    break;
                case 3:
                    showAllFullTimeEmployees();
                    break;
                case 4:
                    showAllPartTimeEmployees();
                    break;
                case 5:
                    showAllEmployees();
                    break;
                case 6:
                    searchEmployeeById();
                    break;
                case 7:
                    deleteEmployeeById();
                    break;
                case 8:
                    editEmployeeById();
                    break;
                case 9:
                    searchEmployeeByPayment();
                    break;
                case 10:
                    sortEmployees();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 11.");
            }
        }
    }

    private static void addFullTimeEmployee() {
        System.out.print("How many Full-time Employee: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter salary: ");
            float salary = sc.nextFloat();
            System.out.print("Enter id: ");
            String id = sc.next();
            for (FulltimeEmployee each : fullTimeEmployees) {
                if (each.getEmployeeId().equals(id)) {
                    System.out.println("ID exixsted!");
                    break;
                }
            }
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter year of birth: ");
            int yob = sc.nextInt();
            System.out.print("Enter address: ");
            String address = sc.next();
            System.out.print("Enter phone: ");
            String phone = sc.next();
            FulltimeEmployee femployee = new FulltimeEmployee(salary, id, name, yob, address, phone);
            fullTimeEmployees.add(femployee);
        }
    }

    private static void addPartTimeEmployee() {
        System.out.print("How many Part-time Employee: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter working hours: ");
            float workingHours = sc.nextFloat();
            System.out.print("Enter pay rates: ");
            float payRates = sc.nextFloat();
            System.out.print("Enter id: ");
            String id = sc.next();
            for (ParttimeEmployee each : partTimeEmployees) {
                if (each.getEmployeeId().equals(id)) {
                    System.out.println("ID exixsted!");
                    break;
                }
            }
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter year of birth: ");
            int yob = sc.nextInt();
            System.out.print("Enter address: ");
            String address = sc.next();
            System.out.print("Enter phone: ");
            String phone = sc.next();
            ParttimeEmployee pe = new ParttimeEmployee(workingHours, payRates, id, name, yob, address, phone);
            partTimeEmployees.add(pe);
        }
    }

    private static void showAllFullTimeEmployees() {
        for (FulltimeEmployee each : fullTimeEmployees) {
            System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
        }
    }

    private static void showAllPartTimeEmployees() {
        for (ParttimeEmployee each : partTimeEmployees) {
            System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
        }
    }

    private static void showAllEmployees() {
        for (FulltimeEmployee each : fullTimeEmployees) {
            System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
        }
        for (ParttimeEmployee each : partTimeEmployees) {
            System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
        }
    }

    private static void searchEmployeeById() {
        System.out.print("Enter id: ");
        String temp = sc.next();
        boolean found = false;
        for (FulltimeEmployee each : fullTimeEmployees) {
            if (each.getEmployeeId().equals(temp)) {
                found = true;
                System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
                break;
            }
        }
        for (ParttimeEmployee each : partTimeEmployees) {
            if (each.getEmployeeId().equals(temp)) {
                found = true;
                System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
                break;
            }
        }
        if (!found) {
            System.out.println("ID not exist!");
        }
    }

    private static void deleteEmployeeById() {
        System.out.print("Enter id: ");
        String temp = sc.next();
        boolean found = false;
        for (FulltimeEmployee each : fullTimeEmployees) {
            if (each.getEmployeeId().equals(temp)) {
                found = true;
                fullTimeEmployees.remove(each);
                System.out.println("Removed! " + "ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
                break;
            }
        }
        for (ParttimeEmployee each : partTimeEmployees) {
            if (each.getEmployeeId().equals(temp)) {
                found = true;
                partTimeEmployees.remove(each);
                System.out.println("Removed! " + "ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + each.calculatePayment());
                break;
            }
        }
        if (!found) {
            System.out.println("ID not exist!");
        }
    }

    private static void editEmployeeById() {
        System.out.print("Enter id: ");
        String temp = sc.next();
        boolean found = false;
        for (FulltimeEmployee each : fullTimeEmployees) {
            if (each.getEmployeeId().equals(temp)) {
                found = true;
                fullTimeEmployees.remove(each);
                System.out.print("Enter salary: ");
                float salary = sc.nextFloat();
                String id = temp;
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter year of birth: ");
                int yob = sc.nextInt();
                System.out.print("Enter address: ");
                String address = sc.next();
                System.out.print("Enter phone: ");
                String phone = sc.next();
                FulltimeEmployee femployee = new FulltimeEmployee(salary, id, name, yob, address, phone);
                fullTimeEmployees.add(femployee);
                break;
            }
        }
        for (ParttimeEmployee each : partTimeEmployees) {
            if (each.getEmployeeId().equals(temp)) {
                found = true;
                partTimeEmployees.remove(each);
                System.out.print("Enter working hours: ");
                float workingHours = sc.nextFloat();
                System.out.print("Enter pay rates: ");
                float payRates = sc.nextFloat();
                String id = temp;
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter year of birth: ");
                int yob = sc.nextInt();
                System.out.print("Enter address: ");
                String address = sc.next();
                System.out.print("Enter phone: ");
                String phone = sc.next();
                ParttimeEmployee pe = new ParttimeEmployee(workingHours, payRates, id, name, yob, address, phone);
                partTimeEmployees.add(pe);
                break;
            }
        }
        if (!found) {
            System.out.println("ID not exist!");
        }
    }

    private static void searchEmployeeByPayment() {
        System.out.print("Enter the minimum payment: ");
        float minPayment = sc.nextFloat();
        System.out.print("Enter the maximum payment: ");
        float maxPayment = sc.nextFloat();
        boolean found = false;

        System.out.println("Full-time Employees within payment range:");
        for (FulltimeEmployee each : fullTimeEmployees) {
            float payment = each.calculatePayment();
            if (payment >= minPayment && payment <= maxPayment) {
                System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + payment);
                found = true;
            }
        }

        System.out.println("Part-time Employees within payment range:");
        for (ParttimeEmployee each : partTimeEmployees) {
            float payment = each.calculatePayment();
            if (payment >= minPayment && payment <= maxPayment) {
                System.out.println("ID: " + each.getEmployeeId() + " ,Name: " + each.getEmployeeName() + " ,Year of Birth: " + each.getYearOfBirth() + " ,Address: " + each.getAddress() + " ,Phone: " + each.getPhone() + " ,Payment: " + payment);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found within the given payment range.");
        }
    }

    private static void sortEmployees() {
        Comparator<Employee> byAge = Comparator.comparingInt(Employee::getYearOfBirth);
        Comparator<Employee> byPayment = Comparator.comparingDouble(Employee::calculatePayment);
        Comparator<Employee> byAgeThenPayment = byAge.thenComparing(byPayment);

        fullTimeEmployees.sort(byAgeThenPayment);
        partTimeEmployees.sort(byAgeThenPayment);

        System.out.println("Sorted Full-time Employees:");
        showAllFullTimeEmployees();

        System.out.println("Sorted Part-time Employees:");
        showAllPartTimeEmployees();
    }

}
