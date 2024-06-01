/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

/**
 *
 * @author Dell
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NewStudentDialog extends JFrame {

    private JTextField studentId, lastName, midName, firstName, yearOfBirth;
    private JRadioButton male, female;
    private JComboBox schoolStage;
    private JButton btnSave, btnClear, btnCancel;

    public NewStudentDialog() throws HeadlessException {
    }

    public NewStudentDialog(GraphicsConfiguration gc) {
        super(gc);
    }

    public NewStudentDialog(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 300);
        this.setLocation(200, 200);
        //pack();
        this.setLayout(new GridLayout(5, 1));
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("Student ID"));
        studentId = new JTextField();
        studentId.setSize(100, 10);
        panel1.add(studentId);
        this.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("Last-Mid- First name"));
        lastName = new JTextField();
        lastName.setPreferredSize(new Dimension(50, 20));
        midName = new JTextField();
        midName.setPreferredSize(new Dimension(50, 20));
        firstName = new JTextField();
        firstName.setPreferredSize(new Dimension(50, 20));
        panel2.add(lastName);
        panel2.add(midName);
        panel2.add(firstName);
        this.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(new JLabel("Year of birth"));
        yearOfBirth = new JTextField();
        yearOfBirth.setPreferredSize(new Dimension(200, 20));
        panel3.add(yearOfBirth);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(male);
        rndGroup.add(female);
        panel3.add(male);
        panel3.add(female);
        this.add(panel3);
        String[] data = {"Elementary School", "Middle School", "High School",};
        schoolStage = new JComboBox();
        this.add(schoolStage);

        JPanel panel4 = new JPanel(new FlowLayout());
        btnSave = new JButton("Save");
        btnClear = new JButton("Clear");
        btnCancel = new JButton("Cancel");
        panel4.add(btnSave);
        panel4.add(btnClear);
        panel4.add(btnCancel);
        this.add(panel4);
    }

    public NewStudentDialog(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    private void SaveStudent() {
String id=studentId.getText();
String last=lastName.getText();
String mid=midName.getText();
String first=firstName.getText();
int yob=Integer.parseInt(yearOfBirth.getText());
String gender=male.isSelected()==true?"Male,Female";
String school=schoolStage.getSelectedItem().toString();
    }
}
