/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class MainFrame extends JFrame {
    private JButton btnCheckTotalStudent,btnNewStudent;

    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnCheckTotalStudent=new JButton("Check total student");
        btnCheckTotalStudent.addActionListener((e)->{
            JOptionPane.showMessageDialog(null, String.format(" There are students in list",2));
             });
        btnNewStudent=new JButton("New student");
        this.setLayout(new BorderLayout());
        JPanel panel1 =new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btnCheckTotalStudent);
        panel1.add(btnNewStudent);
        this.add(panel1,BorderLayout.NORTH);
        this.setSize(800,600);
        this.setLocation(200,200);
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

  
}
