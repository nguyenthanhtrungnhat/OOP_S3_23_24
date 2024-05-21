/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abcbank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tai.tran
 */
public class ABCBank {

    public static void main(String[] args) {
     ArrayList<Employee> arrs = new ArrayList<>();
     //Teller tel = new Teller("322342", 45, 190000000, "Nguyen van A", 20, "teller", "aBC123");
     //arrs.add(tel);
     //   System.out.println(arrs.get(0).GetSalary());
     int n;
     do{
         System.out.print("1. Teller\n2. Officer\n0. Exit\n Input number: ");
         Scanner obj = new Scanner(System.in);
         n = obj.nextInt();
         Employee ee = null;
         switch(n)
         {	
             case 1: 
                 ee = new Teller("332342", 40, 1000, "Nguyen VAn A", 20, "Teller", "abcd123");
                 break;
             case 2:
                 ee = new Officer("1231231313", 2000, "Tran thi B", 30, "Officer", "adfadfad435");
               break;
               
         }
         arrs.add(ee);
     }while(n!=0);
     
     double totalSalary = 0;
     for(int i = 0;i<arrs.size();i++)
     {
         totalSalary += arrs.get(i).GetSalary();
         
     }
        System.out.println("Total salary: " + totalSalary);
    }
}
