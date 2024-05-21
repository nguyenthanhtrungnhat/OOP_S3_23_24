/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment3;

import static cse203.assignment3.CollegeStudent.sc;

/**
 *
 * @author haing
 */
public class UniversityStu extends Student{
    private String thesisName;
    private double thesisScore;

    public UniversityStu() {
    }

    public UniversityStu(String thesisName, double thesisScore) {
        super();
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }
    
    @Override
    public void Input(){
        super.Input();
        System.out.print("Enter thesis name: ");
        thesisName = sc.next();
        System.out.print("Enter thesis score: ");
        thesisScore = sc.nextDouble();
    }
    
    public boolean CheckGraduation(){
        if (numOfCredit < 150){
            return false;
        }
        if (average < 5){
            return false;
        }
        if (thesisScore < 5 ){
            return false;
        }
        return true;
    }
}
