/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ally
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BudgetManager {
    private JFrame frame;
    private JButton logoutButton;
    private JButton reportingAnalyticsButton;
    private JButton budgetManagementButton;
    private Font buttonFont = new Font("Arial", Font.BOLD, 12);
    private Color buttonColor = new Color(237, 28, 36); // Quiznos red
    private Color backgroundColor = new Color(255, 255, 255); // White background

    public void login() {
        if (LoginFrame.username.equals("BudgetManager") && LoginFrame.password.equals("quiznos")) {
            frame = new JFrame("Budget Manager");
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(4, 1)); // Changed to GridLayout
            frame.getContentPane().setBackground(backgroundColor);

           reportingAnalyticsButton = createButton("Reporting and Analytics");
            frame.add(reportingAnalyticsButton);
            
reportingAnalyticsButton.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
              ImageIcon icon = new ImageIcon("report.jpg");
              JLabel label = new JLabel(icon);
                 
              JDialog dialog = new JDialog(frame, "Report and Analytics");
              dialog.setModal(true);
              dialog.getContentPane().add(label);
              dialog.pack();
              dialog.setLocationRelativeTo(frame);
              dialog.setVisible(true);
        }
    });

            budgetManagementButton = createButton("Budget Management");
            frame.add(budgetManagementButton);
            
            budgetManagementButton.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
              ImageIcon icon2 = new ImageIcon("budget.jpg");
              JLabel label2 = new JLabel(icon2);
                  
              JDialog dialog2 = new JDialog(frame, "Campaign and Ad Creation Budget");
              dialog2.setModal(true);
              dialog2.getContentPane().add(label2);
              dialog2.pack();
              dialog2.setLocationRelativeTo(frame);
              dialog2.setVisible(true);
        }
    });

            logoutButton = createButton("Logout");
            logoutButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to log out?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        frame.dispose();
                    }
                }
            });
            frame.add(logoutButton);

            JLabel logoLabel = new JLabel("<html><font color='red'>Qui</font><font color='green'>znos</font></html>");
            logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
            logoLabel.setHorizontalAlignment(JLabel.CENTER);
            frame.add(logoLabel);

            frame.setLocationRelativeTo(null); // This will center the JFrame
            frame.setVisible(true);
        } 
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(buttonFont);
        button.setBackground(buttonColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }
}
