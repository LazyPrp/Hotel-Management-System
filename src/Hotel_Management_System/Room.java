package Hotel_Management_System;

import com.mysql.cj.protocol.Resultset;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame  implements ActionListener {
    JTable tl;
    JButton bback;
    Room(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,785,590);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        ImageIcon imgi1=new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i=imgi1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imgi2=new ImageIcon(i);
        JLabel l13=new JLabel(imgi2);
        l13.setBounds(550,150,200,200);//same as frame height
        jp.add(l13);

        tl=new JTable();
        tl.setBounds(10,40,450,400);
        tl.setFont(new Font("Tahoma",Font.PLAIN,16));
        tl.setForeground(Color.lightGray);
        tl.setBackground(new Color(16,108,115));
        jp.add(tl);

        try{
            Sqlconnection s=new Sqlconnection();
            String room_info="Select * from room";
            ResultSet rs=s.State.executeQuery(room_info);
            tl.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception E){E.printStackTrace();}

        bback=new JButton("Back ");
        bback.setBounds(200,500,110,30);
        bback.setFont(new Font("Tahoma",Font.BOLD,16));
        bback.setForeground(Color.lightGray);
        bback.setBackground(Color.BLACK);
        bback.addActionListener(this);
        jp.add(bback);

        JLabel l7=new JLabel("Room no.");
        l7.setBounds(10,10,100,30);
        l7.setFont(new Font("serif",Font.BOLD,16));
        l7.setForeground(Color.BLACK);
        jp.add(l7);

        JLabel l8=new JLabel("Availability ");
        l8.setBounds(100,10,100,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.BLACK);
        jp.add(l8);

        JLabel l9=new JLabel("Clean status ");
        l9.setBounds(190,10,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.BLACK);
        jp.add(l9);

        JLabel l10=new JLabel("Price ");
        l10.setBounds(290,10,80,30);
        l10.setFont(new Font("serif",Font.BOLD,16));
        l10.setForeground(Color.BLACK);
        jp.add(l10);

        JLabel l11=new JLabel("Bed Type");
        l11.setBounds(370,10,100,30);
        l11.setFont(new Font("serif",Font.BOLD,16));
        l11.setForeground(Color.BLACK);
        jp.add(l11);

        setUndecorated(true);
        setLocation(450,80);
        setLayout(null);
        setSize(795,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Room();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}
