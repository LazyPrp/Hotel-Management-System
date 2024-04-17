package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){


        //Right side pane
        JPanel panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(300,5,1050,721);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        //left side pane
        JPanel panel1= new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,290,721);
        panel1.setBackground(new Color(3, 45, 48));
        add(panel1);

        ImageIcon imgi9=new ImageIcon(ClassLoader.getSystemResource("icon/backgr2.gif"));
        Image i4=imgi9.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon imgi10=new ImageIcon(i4);
        JLabel l8=new JLabel(imgi10);
        l8.setBounds(200,20,600,600);//same as frame height
        panel.add(l8);

        ImageIcon imgi11=new ImageIcon(ClassLoader.getSystemResource("icon/raj2.gif"));
        Image i5=imgi11.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imgi12=new ImageIcon(i5);
        JLabel l9=new JLabel(imgi12);
        l9.setBounds(20,490,220,220);//same as frame height
        panel1.add(l9);

        JButton ncust=new JButton("New Customer");
        ncust.setBounds(30,20,200,30);
        ncust.setBackground(Color.black);
        ncust.setForeground(Color.white);
        panel1.add(ncust);
        ncust.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new New_Customer();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton nroom=new JButton("Room");
        nroom.setBounds(30,60,200,30);
        nroom.setBackground(Color.black);
        nroom.setForeground(Color.white);
        panel1.add(nroom);
        nroom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton Deptt=new JButton("Department");
        Deptt.setBounds(30,100,200,30);
        Deptt.setBackground(Color.black);
        Deptt.setForeground(Color.white);
        panel1.add(Deptt);
        Deptt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new dept();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton allemp=new JButton("All Emplyoee Info.");
        allemp.setBounds(30,140,200,30);
        allemp.setBackground(Color.black);
        allemp.setForeground(Color.white);
        panel1.add(allemp);
        allemp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                        new Employee();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton cinfo=new JButton("Customer Info.");
        cinfo.setBounds(30,180,200,30);
        cinfo.setBackground(Color.black);
        cinfo.setForeground(Color.white);
        panel1.add(cinfo);
        cinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Customer_info();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton minfo=new JButton("Manager Info.");
        minfo.setBounds(30,220,200,30);
        minfo.setBackground(Color.black);
        minfo.setForeground(Color.white);
        panel1.add(minfo);
        minfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Manager_info();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton cout=new JButton("Checkout");
        cout.setBounds(30,420,200,30);
        cout.setBackground(Color.black);
        cout.setForeground(Color.white);
        panel1.add(cout);
        cout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
new Checkout();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton uck=new JButton("Update check-in");
        uck.setBounds(30,300,200,30);
        uck.setBackground(Color.black);
        uck.setForeground(Color.white);
        panel1.add(uck);
        uck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateCheck();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton urs=new JButton("Update room-status");
        urs.setBounds(30,340,200,30);
        urs.setBackground(Color.black);
        urs.setForeground(Color.white);
        panel1.add(urs);
        urs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
new UpdateRoom();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton pks=new JButton("Pick-up Service");
        pks.setBounds(30,380,200,30);
        pks.setBackground(Color.black);
        pks.setForeground(Color.white);

        panel1.add(pks);
        pks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Pickup();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton scr=new JButton("Search Room");
        scr.setBounds(30,260,200,30);
        scr.setBackground(Color.black);
        scr.setForeground(Color.white);
        panel1.add(scr);
        scr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Search_Room();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton bck=new JButton("Back");
        bck.setBounds(80,455,70,20);
        bck.setBackground(Color.black);
        bck.setForeground(Color.white);
        panel1.add(bck);
        bck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new MainScreen();
                }catch(Exception E){E.printStackTrace();
                }
            }
        });

        JButton logout=new JButton("Logout");
        logout.setBounds(450,650,150,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        panel.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    setVisible(false);
                }catch(Exception E){E.printStackTrace();
                }
            }
        });


        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1370,770);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
