/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assighment1_complexnumber;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Assighment1_ComplexNumber {

    public static void main(String[] args) {
//test
        ComplexNumber complexNumber1 = new ComplexNumber();
        System.out.println("Nhap vao so phuc dau tien!");
        complexNumber1.Input();

        ComplexNumber complexNumber2 = new ComplexNumber();
        System.out.println("Nhap vao so phuc thu hai!");
        complexNumber2.Input();

        System.out.print("So phuc sau khi cong la: ");
        complexNumber1.addFunction(complexNumber2).Output();

        System.out.print("So phuc sau khi tru la: ");
        complexNumber1.subFunction(complexNumber2).Output();

        System.out.print("So phuc sau khi nhan la: ");
        complexNumber1.mulFunction(complexNumber2).Output();

        System.out.print("So phuc sau khi chia la: ");
        complexNumber1.divFunction(complexNumber2).Output();
    }
}
