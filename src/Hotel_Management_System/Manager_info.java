package Hotel_Management_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Manager_info extends JFrame {
    Manager_info(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,945,490);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        JLabel l9=new JLabel("Name");
        l9.setBounds(20,10,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.BLACK);
        jp.add(l9);

        JLabel l10=new JLabel("Age ");
        l10.setBounds(135,10,80,30);
        l10.setFont(new Font("serif",Font.BOLD,16));
        l10.setForeground(Color.BLACK);
        jp.add(l10);

        JLabel l1=new JLabel("Gender");
        l1.setBounds(250,10,100,30);
        l1.setFont(new Font("serif",Font.BOLD,16));
        l1.setForeground(Color.BLACK);
        jp.add(l1);

        JLabel l2=new JLabel("Profile ");
        l2.setBounds(365,10,80,30);
        l2.setFont(new Font("serif",Font.BOLD,16));
        l2.setForeground(Color.BLACK);
        jp.add(l2);

        JLabel l3=new JLabel("Salary");
        l3.setBounds(480,10,100,30);
        l3.setFont(new Font("serif",Font.BOLD,16));
        l3.setForeground(Color.BLACK);
        jp.add(l3);

        JLabel l69=new JLabel("Phonenumber ");
        l69.setBounds(595,10,110,30);
        l69.setFont(new Font("serif",Font.BOLD,16));
        l69.setForeground(Color.BLACK);
        jp.add(l69);

        JLabel l4=new JLabel("Aadhar ");
        l4.setBounds(710,10,80,30);
        l4.setFont(new Font("serif",Font.BOLD,16));
        l4.setForeground(Color.BLACK);
        jp.add(l4);

        JLabel l5=new JLabel("Gmail ");
        l5.setBounds(825,10,80,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.BLACK);
        jp.add(l5);

        JTable tl=new JTable();
        tl.setBounds(2,40,940,400);
        tl.setFont(new Font("Tahoma",Font.PLAIN,12));
        tl.setForeground(Color.black);
        tl.setBackground(new Color(16,108,115));
        jp.add(tl);

        JButton bback=new JButton("Back ");
        bback.setBounds(420,400,110,30);
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

        try{
            Sqlconnection s=new Sqlconnection();
            String emp_info="Select * from employee where job='Manager'";
            ResultSet rs=s.State.executeQuery(emp_info);
            tl.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception E){E.printStackTrace();}

        setUndecorated(true);
        setLocation(350,80);
        setLayout(null);
        setSize(955,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Manager_info();
    }
}
