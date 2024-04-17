package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton Add_employee,Add_room,Add_Drivers,logout,back;

    Admin(){



        Add_employee=new JButton("ADD Employee");
        Add_employee.setBounds(200,150,200,30);
        Add_employee.setForeground(Color.black);
        Add_employee.setBackground(Color.lightGray);
        Add_employee.setFont(new Font("Tahoma",Font.BOLD,15));
        Add_employee.addActionListener(this);
        add(Add_employee);

        Add_room=new JButton("ADD Room");
        Add_room.setBounds(200,300,200,30);
        Add_room.setForeground(Color.black);
        Add_room.setBackground(Color.lightGray);
        Add_room.setFont(new Font("Tahoma",Font.BOLD,15));
        Add_room.addActionListener(this);
        add(Add_room);

        Add_Drivers=new JButton("ADD Drivers");
        Add_Drivers.setBounds(200,450,200,30);
        Add_Drivers.setForeground(Color.black);
        Add_Drivers.setBackground(Color.lightGray);
        Add_Drivers.setFont(new Font("Tahoma",Font.BOLD,15));
        Add_Drivers.addActionListener(this);
        add(Add_Drivers);

        ImageIcon imgi13=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i6=imgi13.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imgi14=new ImageIcon(i6);
        JLabel l10=new JLabel(imgi14);
        l10.setBounds(50,102,120,120);//same as frame height
        add(l10);

        ImageIcon imgi15=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i7=imgi15.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imgi16=new ImageIcon(i7);
        JLabel l11=new JLabel(imgi16);
        l11.setBounds(50,250,120,120);//same as frame height
        add(l11);

        ImageIcon imgi17=new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i8=imgi17.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imgi18=new ImageIcon(i8);
        JLabel l12=new JLabel(imgi18);
        l12.setBounds(50,400,120,120);//same as frame height
        add(l12);


        logout=new JButton("Logout");
        logout.setBounds(1000,15,150,30);
        logout.setForeground(Color.black);
        logout.setBackground(Color.lightGray);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

        back=new JButton("Back");
        back.setBounds(170,600,150,30);
        back.setForeground(Color.black);
        back.setBackground(Color.lightGray);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);




        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setSize(1370,770);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Add_employee){
            new Addemp();
        } else if (e.getSource()==Add_room) {
            new Addroom();
        }else if (e.getSource()==Add_Drivers) {
            new Adddrive();
        }else if (e.getSource()==logout) {
        System.exit(101);
        } else if (e.getSource()==back) {
            new MainScreen();
        }

    }
    public static void main(String[] args) {
        new Admin();
    }


}
