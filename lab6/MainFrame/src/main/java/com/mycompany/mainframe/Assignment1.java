/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainframe;

/**
 *
 * @author Dell
 */
import javax.swing.*;
public class Assignment1 {

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
            MainFrame mainFrame = new MainFrame(new StudentManager());
            mainFrame.setVisible(true);
        });
    }
    
}
