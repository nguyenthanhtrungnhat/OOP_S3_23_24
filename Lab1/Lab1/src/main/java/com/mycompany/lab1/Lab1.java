/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Lab1 {

    public static void main(String[] args) {
        Question1 que1 = new Question1(123456);
        que1.displaySumFLD();
        Question2 que2 = new Question2(1, 2, 3);
        que2.displaySumBTN();
        Question3 que3 = new Question3(5);
        que3.findHailStoneNumber();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Question4 que4 = new Question4(numbers);
        que4.displayq4();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.add(3);
        list.add(1);
        Question5 que5 = new Question5(list, 1, true, 2, 1);
        // que5.removeFSE();
        //  que5.insertEleToPosition();
        // que5.findDuplicate();
          que5.rmvDuplicate();
    }
}
