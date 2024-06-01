/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

/**
 *
 * @author Dell
 */
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class MainFrame extends  JFrame{
    private StudentManager studentManager = new StudentManager();

    public MainFrame(StudentManager studentManager1) {
        setTitle("Student Management System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton btnNewStudent = new JButton("New Student");
        JButton btnCheckTotal = new JButton("Check Total Student");

        btnNewStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NewStudentDialog dialog = new NewStudentDialog(MainFrame.this, studentManager);
                dialog.setModal(true);
                dialog.setVisible(true);
            }
        });

        btnCheckTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainFrame.this,
                    "Total Students: " + studentManager.getListStudent().size(),
                    "Total Students", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(btnNewStudent);
        add(btnCheckTotal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame(new StudentManager()).setVisible(true);
        });
    }
}
