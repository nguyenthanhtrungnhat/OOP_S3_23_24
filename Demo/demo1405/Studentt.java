/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1405;

/**
 *
 * @author Phan Thao
 */
public class Studentt {

    private String id;
    private String name;
    private int age;
    private float score;

    public Studentt() {
    }

    public Studentt(String id, String name, int age, float score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void Output() {
        System.out.println("Student id: " + id + "\nFull name: " + name + "\nScore: " + score + "\nAge: " + age);
    }

    public void Input() {

    }
}
