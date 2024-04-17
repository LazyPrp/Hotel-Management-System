package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addroom extends JFrame implements ActionListener {
    JTextField T1,T2,T3;
    JComboBox C1,C2,C3;
    JButton badd,bback;
    Addroom(){
        JPanel jp=new JPanel();
        jp.setBounds(5,5,770,490);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        JLabel l2=new JLabel("ADD ROOMs");
        l2.setBounds(150,10,150,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.lightGray);
        jp.add(l2);

        JLabel l3=new JLabel("Room Number : ");
        l3.setBounds(50,50,150,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,16));
        l3.setForeground(Color.lightGray);
        jp.add(l3);

        T1=new JTextField();
        T1.setBounds(200,50,150,30);
        T1.setFont(new Font("Tahoma",Font.PLAIN,16));
        T1.setForeground(Color.lightGray);
        jp.add(T1);

        JLabel l4=new JLabel("Availability : ");
        l4.setBounds(50,100,150,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,16));
        l4.setForeground(Color.lightGray);
        jp.add(l4);


        C1=new JComboBox(new String []{"Available ","Occupied"});
        C1.setBounds(200,100,150,30);
        C1.setFont(new Font("Tahoma",Font.BOLD,16));
        C1.setForeground(Color.lightGray);
        jp.add(C1);

        JLabel l5=new JLabel("Price : ");
        l5.setBounds(50,150,150,30);
        l5.setFont(new Font("Tahoma",Font.BOLD,16));
        l5.setForeground(Color.lightGray);
        jp.add(l5);

        T2=new JTextField();
        T2.setBounds(200,150,150,30);
        T2.setFont(new Font("Tahoma",Font.PLAIN,16));
        T2.setForeground(Color.lightGray);
        jp.add(T2);

        JLabel l6=new JLabel("Cleaning Status : ");
        l6.setBounds(50,200,170,30);
        l6.setFont(new Font("Tahoma",Font.BOLD,16));
        l6.setForeground(Color.lightGray);
        jp.add(l6);

        C2=new JComboBox(new String []{"Cleaned ","Dirty","Clean"});
        C2.setBounds(200,200,150,30);
        C2.setFont(new Font("Tahoma",Font.PLAIN,16));
        C2.setForeground(Color.lightGray);
        jp.add(C2);



        JLabel l8=new JLabel("Bed Type: ");
        l8.setBounds(50,250,170,30);
        l8.setFont(new Font("Tahoma",Font.BOLD,16));
        l8.setForeground(Color.lightGray);
        jp.add(l8);

        C3=new JComboBox(new String []{"Single Bed ","Double Bed"});
        C3.setBounds(200,250,150,30);
        C3.setFont(new Font("Tahoma",Font.PLAIN,16));
        C3.setForeground(Color.lightGray);
        jp.add(C3);

        ImageIcon imgi19=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image i9=imgi19.getImage().getScaledInstance(280,280,Image.SCALE_DEFAULT);
        ImageIcon imgi20=new ImageIcon(i9);
        JLabel l13=new JLabel(imgi20);
        l13.setBounds(420,50,280,280);//same as frame height
        jp.add(l13);

        badd=new JButton("Add ");
        badd.setBounds(50,400,110,30);
        badd.setFont(new Font("Tahoma",Font.BOLD,16));
        badd.setForeground(Color.lightGray);
        badd.setBackground(Color.BLACK);
        badd.addActionListener(this);
        jp.add(badd);

        bback=new JButton("Back ");
        bback.setBounds(200,400,110,30);
        bback.setFont(new Font("Tahoma",Font.BOLD,16));
        bback.setForeground(Color.lightGray);
        bback.setBackground(Color.BLACK);
        bback.addActionListener(this);
        jp.add(bback);

        // getContentPane().setBackground(new Color(9, 121, 127));
        setUndecorated(true);
        setLocation(500,100);
        setLayout(null);
        setSize(780,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Addroom();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==badd){
            try{
                Sqlconnection s=new Sqlconnection();
                String room=T1.getText();
                String avail=(String) C1.getSelectedItem();
                String stat=(String) C2.getSelectedItem();
                String price=T2.getText();
                String type=(String) C3.getSelectedItem();
                String q="Insert into room values('"+room+"','"+avail+"','"+stat+"','"+price+"','"+type+"')";
                s.State.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully added");
                this.setVisible(false);
            }catch(Exception E){E.printStackTrace();}
        }else{
                setVisible(false);
        }
    }
}
