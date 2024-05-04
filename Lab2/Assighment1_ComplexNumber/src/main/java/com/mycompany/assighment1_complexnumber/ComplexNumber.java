/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assighment1_complexnumber;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        realPart = sc.nextDouble();
        System.out.print("Nhap phan ao: ");
        imaginaryPart = sc.nextDouble();
    }

    public void Output() {
        System.out.println(getRealPart() + " " + getImaginaryPart());

    }

    public ComplexNumber addFunction(ComplexNumber another) {
        return new ComplexNumber(this.realPart + another.getRealPart(), this.imaginaryPart + another.getImaginaryPart());
    }

    public ComplexNumber subFunction(ComplexNumber another) {
        return new ComplexNumber(this.realPart - another.getRealPart(), this.imaginaryPart - another.getImaginaryPart());
    }

    public ComplexNumber mulFunction(ComplexNumber another) {
        return new ComplexNumber((this.realPart * another.getRealPart() - this.imaginaryPart * another.getImaginaryPart()), (this.realPart * another.getImaginaryPart() + this.imaginaryPart * another.getRealPart()));
    }

    public ComplexNumber divFunction(ComplexNumber another) {
        double denominator = another.getRealPart() * another.getRealPart() + another.getImaginaryPart() * another.getImaginaryPart();
        if (denominator == 0) {
            System.out.println("Mau so phai khac 0");
        }
        double realPartResult = (this.realPart * another.getRealPart() + this.imaginaryPart * another.getImaginaryPart()) / denominator;
        double imaginaryPartResult = (this.imaginaryPart * another.getRealPart() - this.realPart * another.getImaginaryPart()) / denominator;
        return new ComplexNumber(realPartResult, imaginaryPartResult);
    }

}
