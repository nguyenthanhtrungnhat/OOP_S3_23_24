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
public class Staff {

    String fullname;
    String dateOfBirth;
    long IDnumber;
    double salary;
    Scanner sc = new Scanner(System.in);

    public Staff(String fullname, String dateOfBirth, long IDnumber, double salary) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.IDnumber = IDnumber;
        this.salary = salary;
    }

    public Staff() {
    }

    public long getIDnumber() {
        return IDnumber;
    }

    public void CalculateSalary() {

    }

    public void Edit() {

    }

    public void Input() {
        System.out.print("Enter Full name: ");
        fullname = sc.nextLine();
        System.out.print("Enter date of birth:  ");
        dateOfBirth = sc.nextLine();

        while (true) {
            try {
                System.out.print("Enter id number: ");
                IDnumber = sc.nextLong();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Please enter id number again: ");
                sc.nextLine();
            }
        }

    }

    @Override
    public String toString() {
        return "ID number: " + IDnumber + "\nFullname: " + fullname + "\nDate of birth: " + dateOfBirth + "\n";
    }

    static Comparator<Staff> comBySalary = (Staff a, Staff b) -> (int) (b.salary - a.salary);

}
