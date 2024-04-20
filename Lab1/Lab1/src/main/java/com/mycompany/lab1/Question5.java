/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Question5 {

    private ArrayList<Integer> numbers;
    private int choosenNumToRemv;
    private boolean flag;
    private int choosenNumToInst;
    private int position;

    public Question5() {
    }

    public Question5(ArrayList<Integer> numbers, int choosenNumToRemv, boolean flag, int choosenNumToInst, int position) {
        this.numbers = numbers;
        this.choosenNumToRemv = choosenNumToRemv;
        this.flag = flag;
        this.choosenNumToInst = choosenNumToInst;
        this.position = position;
    }

    public void removeFSE() {
        System.out.println("Question a: ");
        System.out.println("xoa so " + choosenNumToRemv);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == choosenNumToRemv) {
                numbers.remove(numbers.get(i));
                flag = true;
                System.out.println(flag);
                break;
            } else {
                flag = false;

            }
        }
        if (flag == false) {
            System.out.println(flag);

        }
        System.out.println("Updated list: " + numbers);
    }

    public void insertEleToPosition() {
        System.out.println("Question b: ");
        numbers.add(position, choosenNumToInst);
        numbers.remove(numbers.size() - 1);
        System.out.println("Updated list: " + numbers);
    }

    public void findDuplicate() {
        System.out.println("Question c: ");
        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == numbers.get(i - 1)) {
                System.out.println("Duplicated number: " + numbers.get(i));
            }
        }

    }

    public void rmvDuplicate() {
        System.out.println("Question d: ");
        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == numbers.get(i - 1)) {
                numbers.remove(numbers.get(i));

            }
        }
        System.out.println("Updated list: " + numbers);

    }
}
