/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment1_dictionary;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Assignment1_Dictionary {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.initializeDictionary();
        while (true) {
            System.out.print("Enter an English word to look up (or '.' to quit): ");
            String word = sc.nextLine().trim();

            if (word.equalsIgnoreCase(".")) {
                break;
            }
            //     System.out.println("Hash Function!");
            if (dictionary.wordExists(word)) {
                System.out.println("The meaning of '" + word + "' is: " + dictionary.findMeaning(word));

            } else {
                System.out.println("The word '" + word + "' does not exist in the dictionary.");
            }

//            System.out.println("Tree Function!");
//            if (dictionary.wordExistsTree(word)) {
//                System.out.println("The meaning of '" + word + "' is: " + dictionary.findMeaningTree(word));
//            } else {
//                System.out.println("The word '" + word + "' does not exist in the dictionary.");
//            }
        }
    }

}
