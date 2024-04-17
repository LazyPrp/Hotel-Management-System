package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame{
    Choice cc;
    JButton upd,badd,bback;
    JTextField T2,T3,T4;
    UpdateRoom(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,720,500);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        ImageIcon imgi1=new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image i=imgi1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imgi2=new ImageIcon(i);
        JLabel l13=new JLabel(imgi2);
        l13.setBounds(500,120,200,200);//same as frame height
        jp.add(l13);

        JLabel l5=new JLabel("Update Room Status");
        l5.setBounds(105,10,280,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.WHITE);
        jp.add(l5);

        JLabel l6=new JLabel("Id : ");
        l6.setBounds(15,60,50,30);
        l6.setFont(new Font("serif",Font.BOLD,16));
        l6.setForeground(Color.WHITE);
        jp.add(l6);
        cc=new Choice();
        cc.setBounds(200,60,150,30);
        jp.add(cc);
        try {
            Sqlconnection s=new Sqlconnection();
            ResultSet rs=s.State.executeQuery("Select * from customer");
            while(rs.next()){
                cc.add(rs.getString("number"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        JLabel l7=new JLabel("Room Number : ");
        l7.setBounds(15,100,150,30);
        l7.setFont(new Font("serif",Font.BOLD,16));
        l7.setForeground(Color.WHITE);
        jp.add(l7);
        T2=new JTextField();
        T2.setBounds(200,100,150,30);
        T2.setFont(new Font("Tahoma",Font.PLAIN,16));
        T2.setForeground(Color.lightGray);
        jp.add(T2);

        JLabel l8=new JLabel("Availability : ");
        l8.setBounds(15,150,100,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.WHITE);
        jp.add(l8);
        T3=new JTextField();
        T3.setBounds(200,150,150,30);
        T3.setFont(new Font("Tahoma",Font.PLAIN,16));
        T3.setForeground(Color.lightGray);
        jp.add(T3);


        JLabel l9=new JLabel("Clean Status : ");
        l9.setBounds(15,200,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.WHITE);
        jp.add(l9);
        T4=new JTextField();
        T4.setBounds(200,200,150,30);
        T4.setFont(new Font("Tahoma",Font.PLAIN,16));
        T4.setForeground(Color.lightGray);
        jp.add(T4);



        upd=new JButton("Update ");
        upd.setBounds(150,450,110,30);
        upd.setFont(new Font("Tahoma",Font.BOLD,16));
        upd.setForeground(Color.lightGray);
        upd.setBackground(Color.BLACK);
        upd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Sqlconnection s=new Sqlconnection();
                   String status=T4.getText();
                   s.State.executeUpdate("update room set cleaning_status = '"+status+"' where roomnumber = "+T2.getText() );
                    JOptionPane.showMessageDialog(null,"Updated Successfully");
                    setVisible(false);



                }catch (Exception E){E.printStackTrace();

                }
            }
        });
        jp.add(upd);

        bback=new JButton("Back ");
        bback.setBounds(300,450,110,30);
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

        badd=new JButton("Check ");
        badd.setBounds(450,450,110,30);
        badd.setFont(new Font("Tahoma",Font.BOLD,16));
        badd.setForeground(Color.lightGray);
        badd.setBackground(Color.BLACK);
        badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id=cc.getSelectedItem();
                String q="select * from customer where number ='"+id+"'";
                try {
                    Sqlconnection s=new Sqlconnection();
                    ResultSet r=s.State.executeQuery(q);
                    while(r.next()){
                        T2.setText(r.getString("room"));


                    }
                    ResultSet r1=s.State.executeQuery("select * from room where roomnumber='"+T2.getText()+"'");
                    while(r1.next()){
                        T3.setText(r1.getString("availability"));
                        T4.setText(r1.getString("cleaning_status"));

                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        jp.add(badd);
        setUndecorated(true);
        setLocation(500,80);
        setLayout(null);
        setSize(730,510);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateRoom();
    }
}
