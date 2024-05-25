/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class FileIO {
    public static void main(String[] args){
//         File file = new File(".");
//         System.out.println(file.isDirectory());
//         File file2 = new File("D:\\abc.test");
//         System.out.print(file2.isDirectory());
//        try {
//            FileOutputStream fou = new FileOutputStream(new File("Data.txt"));
//            FileInputStream fin = new FileInputStream(new File("in.txt"));
//            } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
//        }
            //Ghi Object vao file
        MyStudent myStudent = new MyStudent(); // tao doi tuong myStudent

 
        try {   // dat try cacth de tranh ngoai le khi tao va viet File
            FileOutputStream f = new FileOutputStream("D:\\student.dat"); // tao file f tro den student.dat
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(myStudent); // ghi MyStudent theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
 
        // doc Object tu file
        MyStudent ms = null;
 
        try {   // dat try cacth de tranh ngoai le khi tao va doc File
            FileInputStream f = new FileInputStream("D:\\student.dat"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la MyStudent
            ms = (MyStudent) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
 
        // Xuat KQ
        System.out.println("My name is " + ms.name + ". I am " + ms.age + " years old");
        
    }
}
 
class MyStudent implements Serializable{
    String name = "Nguyen Van Quan";
    int age = 21;
}