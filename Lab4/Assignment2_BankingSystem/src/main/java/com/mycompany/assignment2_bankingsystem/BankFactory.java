/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2_bankingsystem;

/**
 *
 * @author Dell
 */
public class BankFactory {

    public static Bank getBank(String bankName) {
        if ("TPBANK".equalsIgnoreCase(bankName)) {
            return new TPBank();
        } else if ("VIETCOMBANK".equalsIgnoreCase(bankName)) {
            return new VietcomBank();
        } else {
            throw new IllegalArgumentException("Unknown bank: " + bankName);
        }

    }
}
