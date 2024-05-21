/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defbank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tai.tran
 */
public class Bank {
    ArrayList<BankAccount> listAcc = new ArrayList<>();

    public Bank() {
    }
    public void Input()
    {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.print("Input N (Accout bank): ");
        n = obj.nextInt();
        for(int i = 0;i<n;i++)
        {
            BankAccount acc = new BankAccount();
            acc.Input(obj);
            listAcc.add(acc);
        }
    }
    public void Print()
    {
        for(int i = 0;i<listAcc.size();i++)
            listAcc.get(i).Print();
    }
    public void Deposit1Account()
    {
        int accNumber;
        double money;
        System.out.print("Input accout number: ");
        Scanner obj = new Scanner(System.in);
        accNumber = obj.nextInt();
        System.out.println("Input money: ");
        money = obj.nextDouble();
        for(int i = 0;i<listAcc.size();i++)
            if(listAcc.get(i).CompareAccoutNumber(accNumber))
                listAcc.get(i).Deposit(money);
    }
    public void TranferMoney()
    {
        int accNumberRe, accNumberSen;
        double money;
        Scanner obj = new Scanner(System.in);
        System.out.println("Input money: ");
        money = obj.nextDouble();
        System.out.print("Accout 1: ");
        accNumberSen = obj.nextInt();
        System.out.print("Accout 2: ");
        accNumberRe = obj.nextInt();
        BankAccount acc1=null, acc2 = null;
        for(int i = 0;i<listAcc.size();i++)
            if(listAcc.get(i).CompareAccoutNumber(accNumber))
        
    }
}
