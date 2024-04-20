/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Dell
 */
public class Question2 {

    private double num1;
    private double num2;
    private double num3;

    public Question2() {
    }

    public Question2(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double minimunBetweenThreeNumber() {
        double min = 0;
        min = Math.min(num3, Math.min(num1, num2));
        return min;
    }

    public void displaySumBTN() {
        System.out.println(minimunBetweenThreeNumber());
    }
}
