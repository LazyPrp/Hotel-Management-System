package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class New_Customer extends JFrame implements ActionListener {
JComboBox C1;
    JButton badd,bback;
JLabel date;
JTextField T2,T3,T4,T5;
    JRadioButton rbm,rbf;
    Choice cc;
    New_Customer(){

        JPanel jp=new JPanel();
        jp.setBounds(5,5,790,590);
        jp.setBackground(new Color(9, 121, 127));
        jp.setLayout(null);
        add(jp);

        ImageIcon imgi1=new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i=imgi1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imgi2=new ImageIcon(i);
        JLabel l13=new JLabel(imgi2);
        l13.setBounds(500,120,200,200);//same as frame height
        jp.add(l13);

        JLabel l5=new JLabel("NEW CUSTOMER INFO. ");
        l5.setBounds(105,10,280,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.WHITE);
        jp.add(l5);

        JLabel l4=new JLabel("ID: ");
        l4.setBounds(50,50,150,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        l4.setForeground(Color.lightGray);
        jp.add(l4);
        C1=new JComboBox(new String []{"Passport ","Aadhar card","Voter id","Driving license"});
        C1.setBounds(150,50,150,30);
        C1.setFont(new Font("Tahoma",Font.BOLD,16));
        C1.setForeground(Color.lightGray);
        jp.add(C1);

        JLabel l9=new JLabel("number: ");
        l9.setBounds(50,100,150,30);
        l9.setFont(new Font("Tahoma",Font.BOLD,15));
        l9.setForeground(Color.lightGray);
        jp.add(l9);
        T2=new JTextField();
        T2.setBounds(200,100,150,30);
        T2.setFont(new Font("Tahoma",Font.PLAIN,16));
        T2.setForeground(Color.lightGray);
        jp.add(T2);

        JLabel l8=new JLabel("Name : ");
        l8.setBounds(50,150,150,30);
        l8.setFont(new Font("Tahoma",Font.BOLD,15));
        l8.setForeground(Color.lightGray);
        jp.add(l8);
        T3=new JTextField();
        T3.setBounds(200,150,150,30);
        T3.setFont(new Font("Tahoma",Font.PLAIN,16));
        T3.setForeground(Color.lightGray);
        jp.add(T3);

        JLabel l7=new JLabel("Gender : ");
        l7.setBounds(50,200,150,30);
        l7.setFont(new Font("Tahoma",Font.BOLD,15));
        l7.setForeground(Color.lightGray);
        jp.add(l7);
        rbm=new JRadioButton("Male");
        rbm.setBounds(200,200,100,30);
        rbm.setBackground(new Color(16,108,115));
        rbm.setFont(new Font("Tahoma",Font.BOLD,16));
        rbm.setForeground(Color.lightGray);
        jp.add(rbm);
        rbf=new JRadioButton("Female");
        rbf.setBounds(300,200,100,30);
        rbf.setBackground(new Color(16,108,115));
        rbf.setFont(new Font("Tahoma",Font.BOLD,16));
        rbf.setForeground(Color.lightGray);
        jp.add(rbf);

        JLabel l6=new JLabel("Country : ");
        l6.setBounds(50,250,150,30);
        l6.setFont(new Font("Tahoma",Font.BOLD,15));
        l6.setForeground(Color.lightGray);
        jp.add(l6);
        T5=new JTextField();
        T5.setBounds(200,250,150,30);
        T5.setFont(new Font("Tahoma",Font.PLAIN,16));
        T5.setForeground(Color.lightGray);
        jp.add(T5);

        JLabel l1=new JLabel("Allocated Room : ");
        l1.setBounds(50,300,150,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,15));
        l1.setForeground(Color.lightGray);
        jp.add(l1);
        cc=new Choice();
        try {
            Sqlconnection s=new Sqlconnection();
            ResultSet rs=s.State.executeQuery("Select * from room");
            while(rs.next()){
                cc.add(rs.getString("roomnumber"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }cc.setBounds(200,300,150,30);
        cc.setFont(new Font("Tahoma",Font.BOLD,15));
        cc.setForeground(Color.lightGray);
        cc.setBackground(new Color(16,108,115));
        jp.add(cc);

        JLabel l2=new JLabel("Check-In : ");
        l2.setBounds(50,350,150,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setForeground(Color.lightGray);
        jp.add(l2);
        Date date1=new Date();
        date=new JLabel(""+date1);
        date.setBounds(200,350,150,30);
        date.setFont(new Font("Tahoma",Font.BOLD,15));
        date.setForeground(Color.lightGray);
        jp.add(date);

        JLabel l3=new JLabel("Deposit: ");
        l3.setBounds(50,400,150,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        l3.setForeground(Color.lightGray);
        jp.add(l3);
        T4=new JTextField();
        T4.setBounds(200,400,150,30);
        T4.setFont(new Font("Tahoma",Font.PLAIN,16));
        T4.setForeground(Color.lightGray);
        jp.add(T4);

        badd=new JButton("Add ");
        badd.setBounds(50,550,110,30);
        badd.setFont(new Font("Tahoma",Font.BOLD,16));
        badd.setForeground(Color.lightGray);
        badd.setBackground(Color.BLACK);
        badd.addActionListener(this);
        jp.add(badd);

        bback=new JButton("Back ");
        bback.setBounds(200,550,110,30);
        bback.setFont(new Font("Tahoma",Font.BOLD,16));
        bback.setForeground(Color.lightGray);
        bback.setBackground(Color.BLACK);
        bback.addActionListener(this);
        jp.add(bback);

        setUndecorated(true);
        setLocation(450,80);
        setLayout(null);
        setSize(800,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new New_Customer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==badd){
            Sqlconnection s=new Sqlconnection();

            String gender=null;
            if(rbm.isSelected()){
                gender="Male";
            }else if(rbf.isSelected()){
                gender="Female";
            }
            String doc=(String) C1.getSelectedItem();
            String num=T2.getText();
            String name=T3.getText();
            String country=T5.getText();
            String choi=cc.getSelectedItem();
            String check=date.getText();
            String dep=T4.getText();

            try{

                String q="Insert into customer values('"+doc+"','"+num+"','"+name+"','"+gender+"','"+country+"','"+choi+"','"+check+"','"+dep+"')";
                String q1="Update room set availability='Occupied' where roomnumber="+choi;
                s.State.executeUpdate(q);

                s.State.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Custmer allocated");
            }catch (Exception E){E.printStackTrace();

            }
        }else {
            setVisible(false);
        }

    }
}
