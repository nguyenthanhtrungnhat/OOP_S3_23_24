/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exexeption;

/**
 *
 * @author tai.tran
 */
public class ExceptionStudent extends Exception{
    private String errorMess;
    private float score;

 
    public ExceptionStudent(String errorMess, float score) {
        super();
        this.score = score;
        this.errorMess = errorMess;
    }
   public String getErrorMess() {
        return errorMess;
    }

    public float getScore() {
        return score;
    }
    
}
