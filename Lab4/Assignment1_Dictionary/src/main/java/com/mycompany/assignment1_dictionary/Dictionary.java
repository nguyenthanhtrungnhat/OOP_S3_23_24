/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1_dictionary;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Dictionary {

    private Map<String, String> hashMap;
    private Map<String, String> treeMap;

    public Dictionary() {
        this.hashMap = new HashMap<>();
        this.treeMap = new TreeMap<>();
    }

    public void initializeDictionary() {
        addWord("hello", "xin chào");
        addWord("goodbye", "tạm biệt");
        addWord("please", "làm ơn");
        addWord("thank you", "cảm ơn");
        addWord("yes", "vâng");
        addWord("no", "không");
        addWord("sorry", "xin lỗi");
        addWord("excuse me", "xin lỗi");
        addWord("help", "giúp đỡ");
        addWord("water", "nước");
    }

    public void addWord(String word, String meaning) {
        hashMap.put(word, meaning);
        treeMap.put(word, meaning);
    }

    public boolean wordExists(String word) {
        return hashMap.containsKey(word);
    }

    public String findMeaning(String word) {
        return hashMap.get(word);
    }

    public boolean wordExistsTree(String word) {
        return treeMap.containsKey(word);
    }

    public String findMeaningTree(String word) {
        return treeMap.get(word);
    }

}
