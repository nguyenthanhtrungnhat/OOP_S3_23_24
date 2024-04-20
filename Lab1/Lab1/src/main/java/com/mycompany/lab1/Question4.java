/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Dell
 */
public class Question4 {
    private int []arr;

    public Question4() {
    }

    public Question4(int[] arr) {
        this.arr = arr;
    }
    public int findSumOfMin(){
        int sumOfMin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumOfMin+=arr[i];
            }
        }
        return sumOfMin;
    }
     public void displayq4() {
        System.out.println(findSumOfMin());
    }
}
