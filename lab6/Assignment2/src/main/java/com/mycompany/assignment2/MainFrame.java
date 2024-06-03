/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author Dell
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    private StudentManager studentManager = new StudentManager();
    private JTable studentTable;
    private StudentTableModel studentTableModel;

    public MainFrame(StudentManager studentManager1) {
        setTitle("Student Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        studentTableModel = studentManager.getStudentTableModel();
        studentTable = new JTable(studentTableModel);
        JButton btnNewStudent = new JButton("New Student");
        JButton btnCheckTotal = new JButton("Check Total Student");
        JButton refreshTableButton = new JButton("Refresh Table");
        studentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        studentTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE) {
                    int row = studentTable.getSelectedRow();
                    if (row != -1) {
                        int result = JOptionPane.showConfirmDialog(MainFrame.this, "Are you sure you want to delete this student?", "Delete Student", JOptionPane.YES_NO_OPTION);
                        if (result == JOptionPane.YES_OPTION) {
                            studentManager.getListStudent().remove(row);
                            fillInStudentTable();
                        }
                    }
                }
            }
        });

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
        refreshTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillInStudentTable();
            }
        });
        JPanel panel = new JPanel();
        panel.add(btnNewStudent);
        panel.add(btnCheckTotal);
        panel.add(refreshTableButton);
        add(new JScrollPane(studentTable), BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        JScrollPane scrollPane = new JScrollPane(studentTable);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void fillInStudentTable() {
        studentTableModel.fireTableDataChanged();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame(new StudentManager()).setVisible(true);
        });
    }
}
