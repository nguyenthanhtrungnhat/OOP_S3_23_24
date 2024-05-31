/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment1;

import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dell
 */
public class Assignment1 {
//lab5

    public static void main(String[] args) {
        
    }
    
    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\student.dat");
            ObjectOutputStream ostream = new ObjectOutputStream(f);
            for (Student stu : arr) {
                ostream.writeObject(stu);
            }
            ostream.close();
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }
    
    public void ReadFile() {
        
    }
    
}
