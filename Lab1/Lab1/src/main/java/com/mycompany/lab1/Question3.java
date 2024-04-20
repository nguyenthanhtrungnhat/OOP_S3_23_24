/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Dell
 */
public class Question3 {

    private int number;

    public Question3() {
    }

    public Question3(int number) {
        this.number = number;
    }

    public void findHailStoneNumber() {
        while (number != 1) {
            if (number % 2 != 0) {
                System.out.print(number + " is odd, so we take 3*n+1: ");
                number = (number * 3) + 1;
                System.out.println(number);
            } else {
                System.out.print(number + " is even, so we take n/2: ");
                number /= 2;
                System.out.println(number);
            }
        }

    }

}
