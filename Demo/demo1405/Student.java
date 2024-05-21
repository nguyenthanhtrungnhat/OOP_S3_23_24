/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo1405;

/**
 *
 * @author Phan Thao
 *
 */
public class Student<T, V, Y extends Number> {

    private V id;
    private String name;
    private Y age;
    private T score;

    public Student() {
    }

    public Student(V id, String name, Y age, T score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void Output() {
        System.out.println("Student id: " + id + "\nFull name: " + name + "\nScore: " + score + "\nAge: " + age);
    }

    public <C> void Input(C value1) {
        System.out.println(value1);
    }
}
