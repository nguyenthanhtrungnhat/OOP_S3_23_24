/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author Dell
 */
public class Manage {

    private Vector<Student> vector = new Vector<>();
    private Scanner sc = new Scanner(System.in);

    public Manage() {
    }

    public void addUni() {
        Student university_students = new University_students();
        university_students.Input();
        vector.add(university_students);
    }

    public void addCol() {
        Student college_students = new College_students();
        college_students.Input();
        vector.add(college_students);
    }

    public void deleteById() {

        System.out.print("Enter ID to delete: ");
        String idToDelete = sc.next();
        boolean idFound = false;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).getId().equals(idToDelete)) {
                vector.remove(i);
                idFound = true;
                System.out.println("Student with ID " + idToDelete + " has been removed.");

            }
            if (!idFound) {
                System.out.println("ID not found.");
            }
        }
    }

    public void printStudentList() {
        for (int i = 0; i < vector.size(); i++) {
            vector.get(i).Output();
        }
    }

    public void sortByTypeAndCode() {
        vector.sort(Student.compareClass);
        System.out.println("Success");
    }

    public void printGraduation() {
        int count = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).CheckGraduation()) {
                vector.get(i).Output();
                count++;
            }
        }
        System.out.println("Number of eligible student: " + count);
    }

    public void findByName() {
        System.out.println("Enter name: ");
        String findName = sc.next();
        boolean nameFound = false;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).getFullName().equals(findName)) {
                vector.get(i).Output();
                nameFound = true;
                System.out.println("Done");
                try {
                    FileOutputStream f = new FileOutputStream("C:\\tạm\\Result.dat");
                    ObjectOutputStream fo = new ObjectOutputStream(f);
                    for (Student st : vector) {
                        if (st.getFullName().equals(findName)) {
                            fo.writeObject(st);
                        }
                    }
                    fo.close();
                    f.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        if (nameFound == false) {
            System.out.println("Name not found");
        }

    }

    public void saveToFile(String fName) {
        try {
            FileOutputStream f = new FileOutputStream(fName);
            ObjectOutputStream fo = new ObjectOutputStream(f);
            for (Student st : vector) {
                fo.writeObject(st);
            }
            fo.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void loadFile(String fname) throws FileNotFoundException, IOException {
        if (!vector.isEmpty()) {
            vector.clear();
        }
        try {
            File f = new File(fname);
            if (!f.exists()) {
                return;
            }
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream fo = new ObjectInputStream(fi);
            Student st;
            while ((st = (Student) (fo.readObject())) != null) {
                vector.add(st);
            }
            fo.close();
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
