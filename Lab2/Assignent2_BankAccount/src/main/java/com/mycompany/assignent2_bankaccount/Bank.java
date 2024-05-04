/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignent2_bankaccount;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Bank {

    ArrayList<BankAcc> listAcc = new ArrayList<>();

    public Bank() {
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so acc: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAcc acc = new BankAcc();
            acc.Input(sc);
            listAcc.add(acc);
        }
    }

    public void Print() {
        for (int i = 0; i < listAcc.size(); i++) {
            listAcc.get(i).Print();
        }
    }

    public void DepositAccount() {
        int accNumberRe;
        int accNumberSe;
        double money;
        System.out.print("Nhap tai khoan gui, tk  nhan, so tien: ");
        Scanner sc = new Scanner(System.in);
        accNumberSe = sc.nextInt();
        accNumberRe = sc.nextInt();
        money = sc.nextDouble();
        BankAcc acc1 = null, acc2 = null;
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).CompareAccountNumber(accNumberSe)) {
                acc1 = listAcc.get(i);
            }
            if (listAcc.get(i).CompareAccountNumber(accNumberRe)) {
                acc2 = listAcc.get(i);
            }
        }
        if (acc1 == null || acc2 == null) {
            System.out.println("Tai khoan khong ho le!");
        } else {
            boolean success = acc1.TransferMoney(acc2, money);
            if (success) {
                System.out.println("Nap tien thanh cong! " + acc1.getmName() + " So du hien tai: " + acc1.getmBalance());
                System.out.println("Nhan tien thanh cong! " + acc2.getmName() + " So du hien tai: " + acc2.getmBalance());
            } else {
                System.out.println("Nap tien that bai.");
            }
        }
    }
}
