package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCheck extends JFrame {

    Choice cc;
    JButton upd,badd,bback;
    JTextField T2,T3,T4,T5,T6;
    UpdateCheck(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,720,500);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        ImageIcon imgi1=new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image i=imgi1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imgi2=new ImageIcon(i);
        JLabel l13=new JLabel(imgi2);
        l13.setBounds(500,120,200,200);//same as frame height
        jp.add(l13);

        JLabel l5=new JLabel("Check in Details");
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

        JLabel l8=new JLabel("Name : ");
        l8.setBounds(15,150,100,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.WHITE);
        jp.add(l8);
        T3=new JTextField();
        T3.setBounds(200,150,150,30);
        T3.setFont(new Font("Tahoma",Font.PLAIN,16));
        T3.setForeground(Color.lightGray);
        jp.add(T3);


        JLabel l9=new JLabel("Checked in : ");
        l9.setBounds(15,200,100,30);
        l9.setFont(new Font("serif",Font.BOLD,16));
        l9.setForeground(Color.WHITE);
        jp.add(l9);
        T4=new JTextField();
        T4.setBounds(200,200,150,30);
        T4.setFont(new Font("Tahoma",Font.PLAIN,16));
        T4.setForeground(Color.lightGray);
        jp.add(T4);

        JLabel l1=new JLabel("Amount paid (rs) ");
        l1.setBounds(15,250,150,30);
        l1.setFont(new Font("serif",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        jp.add(l1);
        T5=new JTextField();
        T5.setBounds(200,250,150,30);
        T5.setFont(new Font("Tahoma",Font.PLAIN,16));
        T5.setForeground(Color.lightGray);
        jp.add(T5);

        JLabel l2=new JLabel("Amount Pending (rs) ");
        l2.setBounds(15,300,150,30);
        l2.setFont(new Font("serif",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        jp.add(l2);
        T6=new JTextField();
        T6.setBounds(200,300,150,30);
        T6.setFont(new Font("Tahoma",Font.PLAIN,16));
        T6.setForeground(Color.lightGray);
        jp.add(T6);

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
                    String id=cc.getSelectedItem();
                    String room=T2.getText();
                    String name=T3.getText();
                    String check=T4.getText();
                    String amount=T5.getText();
                    s.State.executeUpdate("update customer set room ='"+room+"',name = '"+name+"',checkintime='"+check+"',deposit='"+amount+"' where number='"+id+"'");
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
                        T3.setText(r.getString("name"));
                        T4.setText(r.getString("checkintime"));
                        T5.setText(r.getString("deposit"));
                    }
                    ResultSet r1=s.State.executeQuery("select * from room where roomnumber='"+T2.getText()+"'");
                    while(r1.next()){
                       String price=r1.getString("price");
                       int amountpaid = Integer.parseInt(price) - Integer.parseInt(T5.getText());
                        T6.setText(""+amountpaid);
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
        new UpdateCheck();
    }
}
