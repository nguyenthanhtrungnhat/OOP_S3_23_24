/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment2_bankingsystem;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Assignment2_BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bank name (TPBank or VietcomBank): ");
        String bankName = scanner.nextLine();

        try {
            Bank bank = BankFactory.getBank(bankName);
            System.out.println("The bank name is: " + bank.getBankName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
