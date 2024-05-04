/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignent2_bankaccount;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Assignent2_BankAccount {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        bank.Input();

        System.out.print("Danh sach tai khoan: ");
        bank.Print();

        System.out.print("Nhap tai khoan gui, tk nhan, va so tien muon nap: ");
        bank.DepositAccount();
    }
}
