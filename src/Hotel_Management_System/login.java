package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JTextField un1;
    JPasswordField pw1;
    JButton b1,b2;

    login(){

        JLabel l2=new JLabel("USER NAME :");
        l2.setBounds(15,30,150,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.lightGray);
        add(l2);

        JLabel l3=new JLabel(" PASSWORD  :");
        l3.setBounds(15,80,150,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,16));
        l3.setForeground(Color.lightGray);
        add(l3);

        un1=new JTextField();
        un1.setBounds(160,30,160,30);
        un1.setForeground(Color.white);
        un1.setFont(new Font("Tahoma",Font.PLAIN,16));
        un1.setBackground(new Color(26,104,110));
        add(un1);

        pw1 =new JPasswordField();
        pw1.setBounds(160,80,160,30);
        pw1.setForeground(Color.white);
        pw1.setBackground(new Color(26,104,110));
        add(pw1);

        b1=new JButton("Login");
        b1.setBounds(40,170,120,30);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CANCEL");
        b2.setBounds(180,170,120,30);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        add(b2);

        ImageIcon imgi2=new ImageIcon(ClassLoader.getSystemResource("icon/raj2.gif"));
        Image i5=imgi2.getImage().getScaledInstance(245,230,Image.SCALE_DEFAULT);
        ImageIcon imgi3=new ImageIcon(i5);

        JLabel l4=new JLabel(imgi3);
        l4.setBounds(370,20,245,230);//same as frame height
        add(l4);

        setUndecorated(true);
        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setLocation(400,220);
        setSize(700,300);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == b1){
        try{
            Sqlconnection s=new Sqlconnection();
            String user = un1.getText();
            String pass = pw1.getText();
            String q="Select * from login where usrnme = '"+user+"' and password ='"+pass+"'";
            ResultSet rs=s.State.executeQuery(q);
            if(rs.next()){
                new MainScreen();
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid login");
            }

        } catch(Exception E){E.printStackTrace();
        }

    }else{
        System.exit(100);
    }
    }
    public static void main(String[] args) {
        new login();
    }


}
