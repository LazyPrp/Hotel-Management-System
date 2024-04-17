package Hotel_Management_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pickup extends JFrame {
    Choice cc;JButton bback,Dis;
    Pickup(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,660,500);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        JLabel l8=new JLabel("Pick up Service");
        l8.setBounds(105,10,280,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.WHITE);
        jp.add(l8);


        JLabel l9=new JLabel("Type of Car");
        l9.setBounds(105,100,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.WHITE);
        jp.add(l9);

        cc=new Choice();
        cc.setBounds(250,100,150,30);
        jp.add(cc);
        try {
            Sqlconnection s=new Sqlconnection();
            ResultSet rs=s.State.executeQuery("Select * from driver");
            while(rs.next()){
                cc.add(rs.getString("carname"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        JLabel l1=new JLabel("Name");
        l1.setBounds(10,150,50,30);
        l1.setFont(new Font("serif",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        jp.add(l1);
        JLabel l2=new JLabel("Age");
        l2.setBounds(105,150,50,30);
        l2.setFont(new Font("serif",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        jp.add(l2);
        JLabel l3=new JLabel("Gender");
        l3.setBounds(185,150,80,30);
        l3.setFont(new Font("serif",Font.BOLD,16));
        l3.setForeground(Color.WHITE);
        jp.add(l3);
        JLabel l4=new JLabel("Company");
        l4.setBounds(270,150,100,30);
        l4.setFont(new Font("serif",Font.BOLD,16));
        l4.setForeground(Color.WHITE);
        jp.add(l4);
        JLabel l5=new JLabel("Car Name");
        l5.setBounds(355,150,100,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.WHITE);
        jp.add(l5);
        JLabel l6=new JLabel("Availability");
        l6.setBounds(440,150,110,30);
        l6.setFont(new Font("serif",Font.BOLD,16));
        l6.setForeground(Color.WHITE);
        jp.add(l6);
        JLabel l7=new JLabel("Location");
        l7.setBounds(535,150,100,30);
        l7.setFont(new Font("serif",Font.BOLD,16));
        l7.setForeground(Color.WHITE);
        jp.add(l7);


        JTable table=new JTable();
        table.setBounds(10,200,600,50);
        table.setBackground(new Color(9, 121, 127));
        table.setFont(new Font("serif",Font.BOLD,16));
        table.setForeground(Color.WHITE);
        jp.add(table);
        try {
            Sqlconnection s=new Sqlconnection();
            String q="Select * from driver";
            ResultSet rs=s.State.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            while(rs.next()){
                cc.add(rs.getString("carname"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

       Dis=new JButton("Display ");
        Dis.setBounds(150,400,110,30);
        Dis.setFont(new Font("Tahoma",Font.BOLD,16));
        Dis.setForeground(Color.lightGray);
        Dis.setBackground(Color.BLACK);
jp.add(Dis);
Dis.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String q="select * from driver where carname ='"+cc.getSelectedItem()+"'";
        try{
            Sqlconnection s=new Sqlconnection();
          ResultSet r1=s.State.executeQuery(q);
          table.setModel(DbUtils.resultSetToTableModel(r1));
        }catch (Exception E){E.printStackTrace();

        }
    }
});

         bback=new JButton("Back ");
        bback.setBounds(300,400,110,30);
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
        setSize(670,510);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Pickup();
    }
}
