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
        System.out.print("");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.print("");
        mName = sc.nextLine();
        System.out.print("");
        mBalance = sc.nextDouble();
    }

    public void Print() {

    }

    public String ToString() {
        return String.valueOf(mBalance);
    }

    public void Deposit(double money) {
        this.mBalance += money;
    }

    public boolean Withdraw() {
        return false;
    }
    public boolean TransferMoney() {
        return false;
    }
    public boolean CompareAccountNumber() {
        return false;
    }
}
