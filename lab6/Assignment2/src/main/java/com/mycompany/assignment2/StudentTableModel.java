/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class StudentTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Student ID", "Last Name", "Middle Name", "First Name", "Year of Birth", "Gender", "School Stage"};
    private ArrayList<Student> students;

    public StudentTableModel(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return student.getStudentID();
            case 1:
                return student.getLastName();
            case 2:
                return student.getMidName();
            case 3:
                return student.getFirstName();
            case 4:
                return student.getYearOfBirth();
            case 5:
                return student.getGender();
            case 6:
                return student.getSchoolStage();
            default:
                return null;
        }
    }
}
            
