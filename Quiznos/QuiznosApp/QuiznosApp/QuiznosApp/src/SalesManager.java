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

public class SalesManager {
    private JFrame frame;
    private JButton logoutButton;
    private JButton reportingAnalyticsButton;
    private JButton salesComparisonButton;
    private JButton audienceSegmentationButton;
    private Font buttonFont = new Font("Arial", Font.BOLD, 12);
    private Color buttonColor = new Color(237, 28, 36); // Quiznos red
    private Color backgroundColor = new Color(255, 255, 255); // White background

    public void login() {
        if (LoginFrame.username.equals("SalesManager") && LoginFrame.password.equals("quiznos")) {
            frame = new JFrame("Sales Manager");
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(5, 1)); // Changed to GridLayout
            frame.getContentPane().setBackground(backgroundColor);

            salesComparisonButton = createButton("Sales Comparison");
            frame.add(salesComparisonButton);
            salesComparisonButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ImageIcon icon = new ImageIcon("chart.png");
                    JLabel label = new JLabel(icon);

                    JDialog dialog = new JDialog(frame, "Sales Comparison");
                    dialog.setModal(true);
                    dialog.getContentPane().add(label);
                    dialog.pack();
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            });
            
            reportingAnalyticsButton = createButton("Reporting and Analytics");
            reportingAnalyticsButton = createButton("Reporting and Analytics");
            reportingAnalyticsButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String[] columnNames = {"Trend ID", "Date", "MarketSegment", "Indicator", "Value"};
                    Object[][] data = {
                       {"1", "2023-06-01", "Fast Food", "ConsumerDemand", "78"},
                       {"2", "2023-06-01", "Sandwich Shops", "SalesGrowth", "10%"},
                       {"3", "2023-11-01", "Fast Food", "ConsumerDemand", "75"},
                       {"4", "2023-11-01", "Sandwich Shops", "SalesGrowth", "8%"},
                       {"5", "2024-03-01", "Fast Food", "ConsumerDemand", "80"},
                       {"6", "2024-03-01", "Sandwich Shops", "SalesGrowth", "12%"},
                       {"7", "2024-08-01", "Fast Food", "ConsumerDemand", "85"},
                       {"8", "2024-08-01", "Sandwich Shops", "SalesGrowth", "15%"}
                    };

                    JTable table = new JTable(data, columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);

                    JDialog dialog = new JDialog(frame, "Reporting and Analytics");
                    dialog.setModal(true);
                    dialog.getContentPane().add(scrollPane);
                    dialog.setSize(800, 300);
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            });
            frame.add(reportingAnalyticsButton);
            
            audienceSegmentationButton = createButton("Audience Segmentation");
             audienceSegmentationButton = createButton("Audience Segmentation");
            audienceSegmentationButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String[] columnNames = {"CustomerID", "CustomerName", "SegmentName", "AgeGroup", "Gender", "Location", "Interests"};
                    Object[][] data = {
                      {"1", "Emily Wilson", "Teens", "13-17", "Female", "Urban", "Fashion, Sports"},
                      {"2", "James Taylor", "Teens", "13-17", "Male", "Urban", "Sports, Technology"},
                      {"3", "Jessica Lee", "College Students", "18-24", "Both", "Urban", "Education, Gaming"},
                      {"4", "Daniel Johnson", "College Students", "18-24", "Both", "Urban", "Education, Gaming"},
                      {"5", "John Smith", "Young Adults", "18-35", "Male", "Urban", "Technology, Music"},
                      {"6", "Mary Miller", "Young Adults", "18-35", "Female", "Urban", "Music, Travel"},
                      {"7", "Olivia Anderson", "Young Adults", "18-35", "Male", "Urban", "Technology, Music"},
                      {"8", "Jessica Turner", "Young Adults", "18-35", "Female", "Urban", "Music, Travel"},
                      {"9", "Michael Brown", "Professionals", "30-50", "Both", "Metropolitan", "Business, Finance"},
                      {"10", "Jennifer White", "Professionals", "30-50", "Female", "Metropolitan", "Business, Travel"},
                      {"11", "Elizabeth King", "Professionals", "30-50", "Both", "Metropolitan", "Business, Finance"},
                      {"12", "Sarah Johnson", "Families", "25-45", "Female", "Suburban", "Parenting, Cooking"},
                      {"13", "David Harris", "Families", "35-55", "Male", "Suburban", "Cooking, Gardening"},
                      {"14", "William Martinez", "Families", "25-45", "Female", "Suburban", "Parenting, Cooking"},
                      {"15", "Kevin Adams", "Families", "35-55", "Male", "Suburban", "Cooking, Gardening"},
                      {"16", "Robert Davis", "Seniors", "55+", "Male", "Rural", "Gardening, Travel"},
                      {"17", "Lisa Clark", "Seniors", "60+", "Female", "Rural", "Gardening, Music"},
                      {"18", "Susan Adams", "Seniors", "55+", "Male", "Rural", "Gardening, Travel"}

                    };

                    JTable table = new JTable(data, columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);

                    JDialog dialog = new JDialog(frame, "Audience Segmentation");
                    dialog.setModal(true);
                    dialog.getContentPane().add(scrollPane);
                    dialog.setSize(800, 300);
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            });
            frame.add(audienceSegmentationButton);

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
