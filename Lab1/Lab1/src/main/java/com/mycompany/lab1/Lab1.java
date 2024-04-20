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
        //question1
        Question1 que1 = new Question1(123456);
        que1.displaySumFLD();

        //question2
        Question2 que2 = new Question2(1, 2, 3);
        que2.displaySumBTN();

        //question3
        Question3 que3 = new Question3(5);
        que3.findHailStoneNumber();

        //question4
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Question4 que4 = new Question4(numbers);
        que4.displayq4();

        //question5
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.add(3);
        list.add(1);
        Question5 que5 = new Question5(list, 1, true, 2, 1);
        System.out.println("Type a or b or c or d to run function of question_5");
        Scanner sc = new Scanner(System.in);
        String chooice = sc.nextLine();
        if (chooice.equals("a")) {
            que5.removeFSE();
        }
        if (chooice.equals("b")) {
            que5.insertEleToPosition();
        }
        if (chooice.equals("c")) {
            que5.findDuplicate();
        }
        if (chooice.equals("d")) {
            que5.rmvDuplicate();
        }
        //question6
        Question6 que6 = new Question6("trung nhat ", "dep trai");
        que6.displayCL();
        que6.displayCW();
        que6.displayCS();
        que6.palindrome();

    }
}
