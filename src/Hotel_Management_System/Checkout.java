package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Checkout  extends JFrame {
    Choice cc;
    JButton bback,check,checkout;
    Checkout(){


        JPanel jp=new JPanel();
        jp.setBounds(5,5,780,590);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        JLabel l1=new JLabel("Check-Out ");
        l1.setBounds(50,20,100,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        l1.setForeground(Color.WHITE);
        jp.add(l1);

        JLabel l2=new JLabel("Customer id ");
        l2.setBounds(20,70,100,30);
        l2.setFont(new Font("serif",Font.BOLD,14));
        l2.setForeground(Color.WHITE);
        jp.add(l2);

        cc=new Choice();
        cc.setBounds(250,70,150,30);
        jp.add(cc);

        JLabel l3=new JLabel("Room number");
        l3.setBounds(20,150,100,30);
        l3.setFont(new Font("serif",Font.BOLD,16));
        l3.setForeground(Color.WHITE);
        jp.add(l3);

        JLabel l4=new JLabel("");
        l4.setBounds(200,150,100,30);
        l4.setFont(new Font("serif",Font.BOLD,16));
        l4.setForeground(Color.WHITE);
        jp.add(l4);

        JLabel l5=new JLabel("Check-In Time");
        l5.setBounds(20,200,100,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.WHITE);
        jp.add(l5);

        JLabel l8=new JLabel("");
        l8.setBounds(200,200,100,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.WHITE);
        jp.add(l8);

        JLabel l6=new JLabel("Check-Out Time");
        l6.setBounds(20,250,130,30);
        l6.setFont(new Font("serif",Font.BOLD,16));
        l6.setForeground(Color.WHITE);
        jp.add(l6);

        Date date=new Date();
        JLabel l7=new JLabel(""+date);
        l7.setBounds(200,250,250,30);
        l7.setFont(new Font("serif",Font.BOLD,16));
        l7.setForeground(Color.WHITE);
        jp.add(l7);

        try{
            Sqlconnection s=new Sqlconnection();
            ResultSet rs=s.State.executeQuery("select * from customer");
            while(rs.next()){
                cc.add(rs.getString("number"));
            }
        }catch (Exception E){E.printStackTrace();
        }

        check=new JButton("Check ");
        check.setBounds(150,380,110,30);
        check.setFont(new Font("Tahoma",Font.BOLD,16));
        check.setForeground(Color.lightGray);
        check.setBackground(Color.BLACK);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Sqlconnection s=new Sqlconnection();
                    ResultSet r=s.State.executeQuery("select * from customer where number='"+cc.getSelectedItem()+"'");
                    while(r.next()){
                        l4.setText(r.getString("room"));
                        l8.setText(r.getString("checkintime"));
                    }


                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        jp.add(check);

        checkout=new JButton("Check-Out");
        checkout.setBounds(270,450,150,30);
        checkout.setFont(new Font("Tahoma",Font.BOLD,16));
        checkout.setForeground(Color.lightGray);
        checkout.setBackground(Color.BLACK);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Sqlconnection s=new Sqlconnection();
                    s.State.executeUpdate("delete from customer where number = '"+cc.getSelectedItem()+"'");
                    s.State.executeUpdate("update room set availability='Available' where roomnumber ='"+l4.getText()+"'");
JOptionPane.showMessageDialog(null,"Done");
setVisible(false);
                }catch (Exception E){E.printStackTrace();}

            }
        });
        jp.add(checkout);




        bback=new JButton("Back ");
        bback.setBounds(350,380,110,30);
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
        setLocation(400,150);
        setLayout(null);
        setSize(800,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Checkout();
    }
}
