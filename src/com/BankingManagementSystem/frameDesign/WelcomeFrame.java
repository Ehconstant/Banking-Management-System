package com.BankingManagementSystem.frameDesign;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

public class WelcomeFrame extends JFrame
{
     public WelcomeFrame() {
        JFrame frame = new JFrame("Welcome...");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.setBackground(new Color(152, 251, 152));
        contentPane.setLayout(null);
        JLabel lblBankingManagementSystem = new JLabel("BANKING MANAGEMENT SYSTEM", JLabel.CENTER);
        Font f1=new Font("comic sans ms",Font.BOLD,48);
        lblBankingManagementSystem.setFont(new Font("Lucida Handwriting", Font.BOLD, 60));
        lblBankingManagementSystem.setForeground(new Color(0, 0, 128));
        lblBankingManagementSystem.setSize(1300,95);
        lblBankingManagementSystem.setLocation(22,162);;
        contentPane.add(lblBankingManagementSystem);
        
        
        JButton bmanager = new JButton("MANAGER");
        bmanager.setToolTipText("Go To Manager Login Page");
        bmanager.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        Font f2=new Font("comic sans ms",Font.BOLD,22);
        bmanager.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
        bmanager.setForeground(new Color(255, 20, 147));
        bmanager.setSize(275,130);
        bmanager.setLocation(225,473);
        bmanager.setFocusable(false);
        contentPane.add(bmanager);
        bmanager.addActionListener((e) ->
        {
       	managerLogin();
       	
         }
       );
        
        
        JButton baccountant = new JButton("ACCOUNTANT");
       	baccountant.setToolTipText("Go To Accountant Login Page");
       	baccountant.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
       	baccountant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
       	baccountant.setForeground(new Color(255, 20, 147));
        baccountant.setSize(259,130);
        baccountant.setLocation(869,473);
        baccountant.setFocusable(false);
        contentPane.add(baccountant);
 
        
        baccountant.addActionListener((e) ->
        {
       	AccountantLogin();
       	
         }
       );
        
        
        frame.setContentPane(contentPane);
        frame.setSize(1378,780);
        frame.setLocationByPlatform(false);
        frame.setVisible(true);
    }

     public void AccountantLogin()
     {

         SwingUtilities.invokeLater(new Runnable()
         {
             public void run()
             {
                 new LoginAccountant();
                 
             }
         });
     }
     
     public void managerLogin()
     {

         SwingUtilities.invokeLater(new Runnable()
         {
             public void run()
             {
                 new ManagerLoginPage();
                 
             }
         });
     }
    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new WelcomeFrame();
            }
        });
    }
}