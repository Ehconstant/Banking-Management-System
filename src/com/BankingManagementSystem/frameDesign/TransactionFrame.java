package com.BankingManagementSystem.frameDesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.security.Key;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class TransactionFrame extends JFrame{

	private JLabel l1;
	private JTextField accno;
	private JButton bwithdrawal,bdeposit,btransfer;
	
	public TransactionFrame(String title)
	{
		super(title);
		
		setBounds(100, 100, 450, 500);
		JPanel TPage = new JPanel();
		TPage.setBackground(Color.CYAN);
		TPage.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TPage);
		TPage.setLayout(null);
		//setSize(450, 450);
		//setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
		//String AccNo = "Acc1209";
		l1=new JLabel("Account Number : ");
		l1.setBounds(3, 5, 654, 27);
		//l1.setForeground(new Color(108, 0, 58));
		l1.setFont(new Font("Tahoma", Font.BOLD, 22));
		TPage.add(l1);
		l1.setForeground(Color.BLACK);
		
		
		accno=new JTextField();
		accno.setFont(new Font("Tahoma", Font.BOLD, 28));
		accno.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		accno.setBounds(50, 45, 360, 40);
		TPage.add(accno);
		
		
		bwithdrawal=new JButton("Withdraw Money");
		bwithdrawal.setMnemonic(KeyEvent.VK_W);
		bwithdrawal.setBorderPainted(false);
		bwithdrawal.setFont(new Font("Tahoma", Font.BOLD, 22));
		bwithdrawal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bwithdrawal.setForeground(new Color(255, 140, 0));
		bwithdrawal.setBackground(Color.CYAN);
		bwithdrawal.setBounds(130, 150, 200, 51);
		TPage.add(bwithdrawal);
		/*
		
		bwithdrawal.addActionListener((e) ->
										{
											//validateAccno();
											
										}
		
				
									);
									*/
		
		bdeposit = new JButton("Deposit Money");
		bdeposit.setMnemonic(KeyEvent.VK_D);
		bdeposit.setBorderPainted(false);
		bdeposit.setFont(new Font("Tahoma", Font.BOLD, 22));
		bdeposit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		bdeposit.setForeground(new Color(255, 140, 0));
		bdeposit.setBackground(Color.CYAN);
		bdeposit.setBounds(130, 250, 200, 51);
		TPage.add(bdeposit);
		/*
		bdeposit.addActionListener((e) -> 
		{
		
			//validateAccno();
			
		}
				
									
									);
									*/
		
		btransfer = new JButton("Transfer Money");
		btransfer.setMnemonic(KeyEvent.VK_T);
		btransfer.setBorderPainted(false);
		btransfer.setFont(new Font("Tahoma", Font.BOLD, 22));
		btransfer.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btransfer.setForeground(new Color(255, 140, 0));
		btransfer.setBackground(Color.CYAN);
		btransfer.setBounds(130, 350, 200, 51);
		TPage.add(btransfer);
		/*
		btransfer.addActionListener((e) ->
		{
			
			//validateAccno();
		}
		
				
				
				);
				*/
		
		/*TPage.add(l1);TPage.add(accno);
		TPage.add(bwithdrawal);TPage.add(new JLabel(""));
		TPage.add(bdeposit);TPage.add(new JLabel(""));
		TPage.add(btransfer);TPage.add(new JLabel(""));*/
		
		
		
	}
	
	public static void main(String[] args) 
    {
		SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new TransactionFrame("Transactios");;
            }
        });
		
    }
	
}

