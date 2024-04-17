package Hotel_Management_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class dept extends JFrame {
    dept(){
        JPanel jp=new JPanel();
        jp.setBounds(5,5,785,590);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        JTable tl=new JTable();
        tl.setBounds(10,40,450,400);
        tl.setFont(new Font("Tahoma",Font.PLAIN,16));
        tl.setForeground(Color.lightGray);
        tl.setBackground(new Color(16,108,115));
        jp.add(tl);

        JLabel l9=new JLabel("Department");
        l9.setBounds(100,10,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.BLACK);
        jp.add(l9);

        JLabel l10=new JLabel("Budget ");
        l10.setBounds(290,10,80,30);
        l10.setFont(new Font("serif",Font.BOLD,16));
        l10.setForeground(Color.BLACK);
        jp.add(l10);

        try{
            Sqlconnection s=new Sqlconnection();
            String dept_info="Select * from department";
            ResultSet rs=s.State.executeQuery(dept_info);
            tl.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception E){E.printStackTrace();}

        JButton bback=new JButton("Back ");
        bback.setBounds(200,500,110,30);
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
        setSize(795,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new dept();
    }
}
