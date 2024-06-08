/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment3lab6;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class Assignment3lab6 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Ensure the program exits when the frame closes
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create and display the main application window
        SwingUtilities.invokeLater(() -> {
            ArrayListToJTableExample a = new ArrayListToJTableExample();
            a.setVisible(true);
        });
    }
}
