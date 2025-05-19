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

public class CampaignManager {
    private JFrame frame;
    private JButton logoutButton;
    private JButton campaignAnalysisButton;
    private JButton adCreationButton;
    private JButton campaignTrackingButton;
    private JButton salesComparisonButton;
    private JButton reportingAnalyticsButton;
    private Font buttonFont = new Font("Arial", Font.BOLD, 12);
    private Color buttonColor = new Color(237, 28, 36); // Quiznos red
    private Color backgroundColor = new Color(255, 255, 255); // White background
    
    public void login() {
        if (LoginFrame.username.equals("CampaignManager") && LoginFrame.password.equals("quiznos")) {
            frame = new JFrame("Campaign Manager");
            frame.setSize(500, 500);
            frame.setLayout(new GridLayout(7, 1));
            frame.getContentPane().setBackground(backgroundColor);
            campaignAnalysisButton = createButton("Campaign Analysis");
            campaignAnalysisButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String[] columnNames = {"CampaignID", "CampaignName", "StartDate", "EndDate", "Budget", "TargetAudience", "Objective"};
                    Object[][] data = {
                        {"1", "Summer Special", "2023-06-01", "2023-08-31", "$50,000", "Food Enthusiasts", "Sales Promotion"},
                        {"2", "Holiday Feast", "2023-11-15", "2023-12-31", "$40,000", "Families", "Brand Awareness"},
                        {"3", "Spring Fling", "2023-03-01", "2023-05-31", "$30,000", "Young Adults", "Product Launch"},
                        {"4", "Winter Wonderland", "2023-12-01", "2024-02-28", "$60,000", "Families", "Brand Awareness"},
                        {"5", "Autumn Extravaganza", "2023-09-01", "2023-11-30", "$45,000", "Food Enthusiasts", "Sales Promotion"},
                        {"6", "Back to School", "2023-07-01", "2023-09-30", "$35,000", "Students", "Product Launch"},
                        {"7", "New Year, New You", "2024-01-01", "2024-01-31", "$55,000", "Adults", "Brand Awareness"},
                        {"8", "Valentine's Special", "2024-02-01", "2024-02-14", "$25,000", "Couples", "Sales Promotion"},
                        {"9", "Easter Extravaganza", "2024-04-01", "2024-04-30", "$40,000", "Families", "Product Launch"},
                        {"10", "Mid-Year Sale", "2024-06-01", "2024-06-30", "$50,000", "Budget Shoppers", "Sales Promotion"},
                        {"11", "Fall Festival", "2024-09-01", "2024-11-30", "$45,000", "Families", "Brand Awareness"},
                        {"12", "Winter Sale", "2024-12-01", "2024-12-31", "$60,000", "Budget Shoppers", "Sales Promotion"},
                        {"13", "Spring Sale", "2024-03-01", "2024-05-31", "$35,000", "Young Adults", "Product Launch"},
                        {"14", "Summer Festival", "2024-06-01", "2024-08-31", "$50,000", "Families", "Brand Awareness"},
                        {"15", "Back to School Sale", "2024-07-01", "2024-09-30", "$40,000", "Students", "Sales Promotion"}
                    };

                    JTable table = new JTable(data, columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);

                    JDialog dialog = new JDialog(frame, "Campaign Analysis");
                    dialog.setModal(true);
                    dialog.getContentPane().add(scrollPane);
                    dialog.setSize(750, 300);
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            });
            frame.add(campaignAnalysisButton);
            
            adCreationButton = createButton("Ad Creation and Management");
            adCreationButton.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                    String[] columnNames = {"MethodID", "Method", "Timestamp", "Status", "Reach", "Engagement", "AllocatedBudget", "Impressions", "CostPerClick"};
                    Object[][] data = {
                        {"1", "Pamphlet/Posters", "2020-11-27 05:00:00", "On-going", "25000", "35%", "15000", "10000", "$0.10"},
                        {"2", "TV Commercial/Video Ad", "2023-12-13 12:00:00", "On-going", "55000", "30%", "30000", "55000", "$0.10"},
                        {"3", "Radio Commercial", "2023-12-18 12:00:00", "Paused", "5000", "5%", "20000", "25000", "$0.10"},
                        {"4", "Billboard/Magazine", "2023-06-06 05:30:00", "On-going", "55000", "60%", "15000", "55000", "$0.10"},
                        {"5", "Website", "2023-06-01 06:00:00", "On-going", "60000", "80%", "30000", "65000", "$0.10"},
                        {"6", "Postcards", "2023-05-01 07:00:00", "On-going", "5000", "15%", "5000", "2500", "$0.00"},
                        {"7", "Social Media Ads", "2023-04-01 08:00:00", "On-going", "40000", "40%", "6000", "40000", "$0.10"},
                        {"8", "Product Ads", "2023-03-01 09:00:00", "On-going", "45000", "45%", "5000", "45000", "$0.00"},
                        {"9", "Newspaper Ads", "2023-02-01 10:00:00", "On-going", "30000", "25%", "8000", "35000", "$0.15"},
                        {"10", "Flyers", "2023-01-01 11:00:00", "On-going", "2000", "10%", "2000", "1500", "$0.05"},
                        {"11", "Email Marketing", "2023-02-15 09:00:00", "On-going", "35000", "25%", "10000", "30000", "$0.08"},
                        {"12", "Search Engine Ads", "2023-03-20 10:30:00", "Paused", "25000", "20%", "12000", "20000", "$0.12"},
                        {"13", "Event Sponsorship", "2023-04-25 13:45:00", "On-going", "45000", "40%", "25000", "40000", "$0.20"},
                       
                    };

                    JTable table = new JTable(data, columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);

                    JDialog dialog = new JDialog(frame, "Ad Creation and Management");
                    dialog.setModal(true);
                    dialog.getContentPane().add(scrollPane);
                    dialog.setSize(800, 300);
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                };

            });
            frame.add(adCreationButton);

            campaignTrackingButton = createButton("Campaign Tracking");
            campaignTrackingButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String[] columnNames = {"MetricID", "CampaignID", "Timestamp", "Engagement", "Reach", "ConversionRate", "ClickThroughRate", "Impressions", "CostPerClick"};
                    Object[][] data = {
                        {"1", "1", "2023-06-15 12:30:00", "1500", "30000", "5%", "2.5%", "500000", "$0.10"},
                        {"2", "2", "2023-11-20 15:45:00", "1200", "25000", "3.5%", "1.8%", "400000", "$0.08"},
                        {"3", "3", "2023-03-15 14:00:00", "1800", "35000", "4%", "2%", "600000", "$0.09"},
                        {"4", "4", "2023-12-15 16:00:00", "2000", "40000", "4.5%", "2.2%", "700000", "$0.11"},
                        {"5", "5", "2023-09-15 13:00:00", "1600", "32000", "4.2%", "2.1%", "650000", "$0.10"},
                        {"6", "6", "2023-07-15 15:00:00", "1700", "34000", "3.8%", "1.9%", "620000", "$0.09"},
                        {"7", "7", "2024-01-15 12:00:00", "1900", "38000", "4.3%", "2.2%", "680000", "$0.11"},
                        {"8", "8", "2024-02-15 14:00:00", "1500", "30000", "3.7%", "1.8%", "550000", "$0.08"},
                        {"9", "9", "2024-04-15 16:00:00", "2100", "42000", "4.6%", "2.3%", "720000", "$0.12"},
                        {"10", "10", "2024-06-15 13:00:00", "2200", "44000", "4.8%", "2.4%", "750000", "$0.13"},
                        {"11", "11", "2024-09-15 15:00:00", "2300", "46000", "5%", "2.5%", "780000", "$0.14"},
                        {"12", "12", "2024-12-15 12:00:00", "2400", "48000", "5.2%", "2.6%", "800000", "$0.15"},
                        {"13", "13", "2024-03-15 14:00:00", "2500", "50000", "5.4%", "2.7%", "820000", "$0.16"},
                        {"14", "14", "2024-06-15 16:00:00", "2600", "52000", "5.6%", "2.8%", "840000", "$0.17"},
                        {"15", "15", "2024-07-15 13:00:00", "2700", "54000", "5.8%", "2.9%", "860000", "$0.18"}
                    };

                    JTable table = new JTable(data, columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);

                    JDialog dialog = new JDialog(frame, "Campaign Tracking");
                    dialog.setModal(true);
                    dialog.getContentPane().add(scrollPane);
                    dialog.setSize(800, 300);
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            });
            frame.add(campaignTrackingButton);

            salesComparisonButton = createButton("Sales Comparison");
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
            frame.add(salesComparisonButton);

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