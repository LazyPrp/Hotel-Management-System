package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame implements ActionListener {
JButton Admin,Reception;
    MainScreen(){
        super("Hotel Management System");


//rECEPTION IMAGE
        ImageIcon imgi7=new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i3=imgi7.getImage().getScaledInstance(180,185,Image.SCALE_DEFAULT);
        ImageIcon imgi8=new ImageIcon(i3);
        JLabel l7=new JLabel(imgi8);
        l7.setBounds(350,150,180,185);//same as frame height
        add(l7);

        Reception=new JButton("Reception");
        Reception.setBounds(370,350,140,30);
        Reception.setFont(new Font("Tahoma",Font.BOLD,15));
        Reception.setForeground(Color.white);
        Reception.setBackground(new Color(255,98,0));
        Reception.addActionListener(this);
        add(Reception);


//ADMIN IMAGE
        ImageIcon imgi5=new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2=imgi5.getImage().getScaledInstance(180,185,Image.SCALE_DEFAULT);
        ImageIcon imgi6=new ImageIcon(i2);
        JLabel l6=new JLabel(imgi6);
        l6.setBounds(750,150,180,185);//same as frame height
        add(l6);

        Admin=new JButton("Admin");
        Admin.setBounds(770,350,140,30);
        Admin.setFont(new Font("Tahoma",Font.BOLD,15));
        Admin.setForeground(Color.white);
        Admin.setBackground(new Color(255,98,0));
        Admin.addActionListener(this);
        add(Admin);

        ImageIcon imgi3=new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1=imgi3.getImage().getScaledInstance(1370,770,Image.SCALE_DEFAULT);
        ImageIcon imgi4=new ImageIcon(i1);
        JLabel l5=new JLabel(imgi4);
        l5.setBounds(0,0,1370,770);//same as frame height
        add(l5);


        setLayout(null);
        setSize(1370,770);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==Reception){
        new Reception();
        setVisible(false);
    }else{
            new Adminlogin();
    }
    }
}
