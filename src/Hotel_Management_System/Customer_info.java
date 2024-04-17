package Hotel_Management_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Customer_info extends JFrame {

    JTable tl;
    Customer_info(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,790,490);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);


        tl=new JTable();
        tl.setBounds(5,100,778,250);
        tl.setFont(new Font("Tahoma",Font.PLAIN,12));
        tl.setForeground(Color.lightGray);
        tl.setBackground(new Color(16,108,115));
        jp.add(tl);
        try{
            Sqlconnection s=new Sqlconnection();
            String cust_info="Select * from customer";
            ResultSet rs=s.State.executeQuery(cust_info);
            tl.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception E){E.printStackTrace();}

        JLabel l4=new JLabel("ID");
        l4.setBounds(20,70,50,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        l4.setForeground(Color.BLACK);
        jp.add(l4);

        JLabel l9=new JLabel("number");
        l9.setBounds(120,70,80,30);
        l9.setFont(new Font("Tahoma",Font.BOLD,15));
        l9.setForeground(Color.BLACK);
        jp.add(l9);

        JLabel l8=new JLabel("Name");
        l8.setBounds(210,70,80,30);
        l8.setFont(new Font("Tahoma",Font.BOLD,15));
        l8.setForeground(Color.BLACK);
        jp.add(l8);

        JLabel l7=new JLabel("Gender");
        l7.setBounds(300,70,80,30);
        l7.setFont(new Font("Tahoma",Font.BOLD,15));
        l7.setForeground(Color.BLACK);
        jp.add(l7);


        JLabel l6=new JLabel("Country");
        l6.setBounds(400,70,80,30);
        l6.setFont(new Font("Tahoma",Font.BOLD,15));
        l6.setForeground(Color.BLACK);
        jp.add(l6);

        JLabel l1=new JLabel("Room no");
        l1.setBounds(500,70,150,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,15));
        l1.setForeground(Color.BLACK);
        jp.add(l1);

        JLabel l3=new JLabel("Check in");
        l3.setBounds(600,70,100,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        l3.setForeground(Color.BLACK);
        jp.add(l3);

        JLabel l2=new JLabel("Deposit");
        l2.setBounds(700,70,100,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setForeground(Color.BLACK);
        jp.add(l2);

       JButton bback=new JButton("Back ");
        bback.setBounds(300,450,110,30);
        bback.setFont(new Font("Tahoma",Font.BOLD,16));
        bback.setForeground(Color.lightGray);
        bback.setBackground(Color.BLACK);
        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        jp.add(bback);

        setUndecorated(true);
        setLocation(450,80);
        setLayout(null);
        setSize(800,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Customer_info();
    }
}
