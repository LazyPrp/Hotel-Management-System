package Hotel_Management_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Search_Room extends JFrame implements ActionListener {
    JCheckBox cb;

    JButton badd,bback;

    Choice cc;
    JTable tl;
    Search_Room(){
        JPanel jp=new JPanel();
        jp.setBounds(5,5,720,500);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        JLabel l5=new JLabel("Search for Room ");
        l5.setBounds(105,10,280,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.WHITE);
        jp.add(l5);

        cb=new JCheckBox("Only Display Available ");
        cb.setBounds(450,50,150,30);
        cb.setFont(new Font("Tahoma",Font.BOLD,15));
        cb.setForeground(Color.lightGray);
        jp.add(cb);

        cc=new Choice();
        cc.add("Single Bed");
        cc.add("Double Bed");
        cc.setBounds(100,50,150,30);
        cc.setFont(new Font("Tahoma",Font.BOLD,15));
        cc.setForeground(Color.lightGray);
        cc.setBackground(new Color(16,108,115));
        jp.add(cc);

        JLabel l7=new JLabel("Room no.");
        l7.setBounds(30,110,100,30);
        l7.setFont(new Font("serif",Font.BOLD,16));
        l7.setForeground(Color.BLACK);
        jp.add(l7);

        JLabel l8=new JLabel("Availability ");
        l8.setBounds(150,110,100,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.BLACK);
        jp.add(l8);

        JLabel l9=new JLabel("Clean status ");
        l9.setBounds(300,110,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.BLACK);
        jp.add(l9);

        JLabel l10=new JLabel("Price ");
        l10.setBounds(450,110,80,30);
        l10.setFont(new Font("serif",Font.BOLD,16));
        l10.setForeground(Color.BLACK);
        jp.add(l10);

        JLabel l11=new JLabel("Bed Type");
        l11.setBounds(580,110,100,30);
        l11.setFont(new Font("serif",Font.BOLD,16));
        l11.setForeground(Color.BLACK);
        jp.add(l11);


        tl=new JTable();
        tl.setBounds(10,150,700,250);
        tl.setFont(new Font("Tahoma",Font.PLAIN,12));
        tl.setForeground(Color.lightGray);
        tl.setBackground(new Color(16,108,115));
        jp.add(tl);
        try{
            Sqlconnection s=new Sqlconnection();
            String src_room="Select * from room";
            ResultSet rs=s.State.executeQuery(src_room);
            tl.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception E){E.printStackTrace();}


        badd=new JButton("Search");
        badd.setBounds(250,450,110,30);
        badd.setFont(new Font("Tahoma",Font.BOLD,16));
        badd.setForeground(Color.lightGray);
        badd.setBackground(Color.BLACK);
        badd.addActionListener(this);
        jp.add(badd);

        bback=new JButton("Back ");
        bback.setBounds(450,450,110,30);
        bback.setFont(new Font("Tahoma",Font.BOLD,16));
        bback.setForeground(Color.lightGray);
        bback.setBackground(Color.BLACK);
        bback.addActionListener(this);
        jp.add(bback);

        setUndecorated(true);
        setLocation(450,80);
        setLayout(null);
        setSize(730,510);
        setVisible(true);

    }

    public static void main(String[] args) {
       new Search_Room();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==badd){
            String q="Select * from room where bed_type = '"+cc.getSelectedItem()+"'";
            String q1="Select * from room where availability ='Available' and bed_type = '"+cc.getSelectedItem()+"'";
            try{ Sqlconnection s=new Sqlconnection();
                ResultSet rs=s.State.executeQuery(q);
                tl.setModel(DbUtils.resultSetToTableModel(rs));
                if(cb.isSelected()){
                    ResultSet rs1=s.State.executeQuery(q1);
                    tl.setModel(DbUtils.resultSetToTableModel(rs));
                }


            }catch (Exception E){E.printStackTrace();
                }
        }else {
                setVisible(false);
        }


    }
}
