/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignent2_bankaccount;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BankAcc {

    private int mAccNum;
    private String mName;
    private double mBalance;

    public BankAcc() {
    }

    public BankAcc(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public int getmAccNum() {
        return mAccNum;
    }

    public String getmName() {
        return mName;
    }

    public double getmBalance() {
        return mBalance;
    }

    public void Input(Scanner sc) {
        System.out.print("Nhap so tk: ");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        mName = sc.nextLine();
        System.out.print("Nhap so tien trong tai khoan hien co: ");
        mBalance = sc.nextDouble();
    }

    public void Print() {
        System.out.println(mAccNum+" "+mName+" "+mBalance);
    }

    public String ToString() {
        return String.valueOf(mBalance);
    }

    public void Deposit(double money) {
        this.mBalance += money;
    }

    public boolean Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Khong hop le!");
            return false;
        }
        if (amount > mBalance) {
            System.out.println("Kkhong du tien!");
            return false;
        }
        mBalance -= amount;
        System.out.println("Rut thanh cong!");
        return true;
    }

    public boolean TransferMoney(BankAcc acc, double money) {
        if (money <= 0) {
            return false;
        }
        if (money > this.mBalance) {
            return false;
        }
        this.Withdraw(money);
        acc.Deposit(money);
        return true;
    }

    public boolean CompareAccountNumber(int acc) {
        return acc == this.mAccNum;
    }
}
