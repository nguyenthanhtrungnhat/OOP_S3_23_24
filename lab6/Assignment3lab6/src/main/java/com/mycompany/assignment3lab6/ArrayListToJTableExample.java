/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3lab6;

/**
 *
 * @author Dell
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayListToJTableExample extends JFrame {

    private JTable table;
    private DefaultTableModel model;
    private JLabel selectedRowLabel;

    public ArrayListToJTableExample() {
        setTitle("ArrayList to JTable Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        
        // Create JTable and DefaultTableModel
        model = new DefaultTableModel();
        table = new JTable(model);
        
        // Add columns to the table
        model.addColumn("Student Code");
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Major");

        // Add table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        // Populate ArrayList with sample data
        ArrayList<String[]> dataList = new ArrayList<>();
        dataList.add(new String[]{"CSE001", "Nguyen Van A", "19", "IT"});
        dataList.add(new String[]{"CSE002", "Tran Thi B", "20", "IT"});
        
        // Add data from ArrayList to DefaultTableModel
        for (String[] rowData : dataList) {
            model.addRow(rowData);
        }
        
        // Add save button
        JButton saveButton = new JButton("Save to File");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    saveSelectedRowToFile("Student.Dat", selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "No row selected!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Panel to hold the save button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Label to display the selected row index
        selectedRowLabel = new JLabel("Selected Row: None");
        getContentPane().add(selectedRowLabel, BorderLayout.NORTH);

        // Add a mouse listener to update the selected row label
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    selectedRowLabel.setText("Selected Row: " + selectedRow);
                } else {
                    selectedRowLabel.setText("Selected Row: None");
                }
            }
        });

        pack(); // Automatically resize according to the components it contains
        setLocationRelativeTo(null);
    }

    private void saveSelectedRowToFile(String fileName, int selectedRow) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                writer.print(model.getValueAt(selectedRow, col));
                if (col < model.getColumnCount() - 1) {
                    writer.print(",");
                }
            }
            writer.println();
            JOptionPane.showMessageDialog(this, "Selected row data saved successfully to " + fileName);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ArrayListToJTableExample().setVisible(true);
        });
    }
}
