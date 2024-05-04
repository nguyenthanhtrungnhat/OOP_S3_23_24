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
}
