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
import java.awt.event.*;

public class LoginFrame extends JFrame {


    private Container container;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel logoLabel;

    public static String username;
    public static String password;

    public LoginFrame() {
        setTitle("Quiznos Login");
        setBounds(300, 90, 400, 250); // Slightly larger window to accommodate the logo
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(255, 255, 255)); // White background

        // Logo with stylized text
        logoLabel = new JLabel("<html><font color='red'>Qui</font><font color='green'>znos</font></html>");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        logoLabel.setBounds(145, 10, 160, 50); // Adjust size and position as needed
        container.add(logoLabel);

        // Styling for labels and text fields
        Font labelFont = new Font("Arial", Font.BOLD, 12);

        userLabel = new JLabel("Username");
        userLabel.setBounds(50, 70, 100, 30);
        userLabel.setFont(labelFont);
        container.add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 70, 150, 30);
        container.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 115, 100, 30);
        passwordLabel.setFont(labelFont);
        container.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(150, 115, 150, 30);
        container.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 160, 100, 30);
        loginButton.setBackground(new Color(237, 28, 36)); // Quiznos red
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 12));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                username = userText.getText();
                password = new String(passwordText.getPassword());

                // Assuming CampaignManager, SalesManager, and BudgetManager are part of your code
                CampaignManager cm = new CampaignManager();
                SalesManager sm = new SalesManager();
                BudgetManager bm =  new BudgetManager();

                cm.login();
                sm.login();
                bm.login();
                dispose();
            }
        });
        container.add(loginButton);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
