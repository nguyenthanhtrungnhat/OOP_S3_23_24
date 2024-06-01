/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class StudentManager {

    List<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /*i. Student findStudentById(String studentID): return a student with a specific id. Return null if 
cannot found.
ii. boolean addStudent(Student stu): if the added student’s id is existed in the database, return 
false. Otherwise return true.
iii. ArrayList<Student> getListStudent(): */    
    public void findStudentById(String studentID) {
        System.out.println("Enter id: ");
        String foundId = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (foundId.equals(list.get(i).getStudentID())) {
                System.out.println(list.get(i));
            } else {
                System.out.println("Not found!");
            }
        }
    }

    public boolean addStudent(Student stu) {
        for (int i = 0; i < list.size(); i++) {
            if (stu.getStudentID().equals(list.get(i).getStudentID())) {
                return false;
            } else {
                return true;
            }
        }
//        if(list.contains(stu.getStudentID()))
//            return false;
//        else
//            return true;
    }

    public void getListStudent() {
        for (Student s : list) {
            System.out.println(s.getStudentID() + " " + s.getFirstName() + " " + s.getMidName() + " " + s.getLastName() + " " + s.getGender() + " " + s.getSchoolStage());
        }
    }
}
