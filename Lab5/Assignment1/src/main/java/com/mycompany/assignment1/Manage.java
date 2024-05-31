/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.io.FileInputStream;
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).getFullName().equals(findName)) {
                vector.get(i).Output();
                sb.append(vector.get(i)).append("\n");
                nameFound = true;
            }
        }
        try {
            FileOutputStream f = new FileOutputStream("C:\\tạm\\Result.dat");
            ObjectOutputStream ostream = new ObjectOutputStream(f);
            ostream.writeObject(sb);
            System.out.println("Done");
            ostream.close();
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
        if (!nameFound) {
            System.out.println("Name not found.");
        }
    }

    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\tạm\\student.dat");
            ObjectOutputStream ostream = new ObjectOutputStream(f);
            for (Student stu : vector) {
                ostream.writeObject(stu);
            }
            System.out.println("Done");
            ostream.close();
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void ReadFileU() {
        try {
            FileInputStream f = new FileInputStream("C:\\tạm\\Ustudent.dat");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Student s = null;
            while ((s = (University_students) inStream.readObject()) != null) {
                vector.add(s);
            }
            System.out.println("Done");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }

    public void ReadFileC() {
        try {
            FileInputStream f = new FileInputStream("C:\\tạm\\Cstudent.dat");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Student s = null;
            while ((s = (College_students) inStream.readObject()) != null) {
                vector.add(s);
            }
            System.out.println("Done");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }
}
