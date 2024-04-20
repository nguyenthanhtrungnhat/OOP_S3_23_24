/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Dell
 */
public class Question6 {

    private String string;
    private String string2;

    public Question6() {
    }

    public Question6(String string, String string2) {
        this.string = string;
        this.string2 = string2;
    }

    public int countLength() {
        int count = string.length();
        return count;
    }

    public void displayCL() {
        System.out.println("length of string is: " + countLength());
    }

    public int countWords() {

        int countWords = string.split("\\s").length;
        return countWords;
    }

    public void displayCW() {
        System.out.println("number of words in string: " + countWords());
    }

    public String ConcatenateString() {
        String updatedString = string + string2;
        return updatedString;
    }

    public void displayCS() {
        System.out.println("concatenation of string and string2: " + ConcatenateString());
    }

    public void palindrome() {
        
        StringBuilder strBuilder = new StringBuilder(string);
        if(string.equals(strBuilder.reverse().toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
