package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addemp extends JFrame implements ActionListener {
JComboBox C1;
JRadioButton rbm,rbf;
JTextField T1,T2,T3,T4,T5,T6;
JButton badd,bback;
    Addemp(){

    JPanel jp=new JPanel();
    jp.setBounds(5,5,785,600);
    jp.setBackground(new Color(9, 121, 127));
    jp.setLayout(null);
    add(jp);

        JLabel l9=new JLabel("ADD Employee Details ");
        l9.setBounds(470,20,250,30);
        l9.setFont(new Font("Tahoma",Font.BOLD,20));
        l9.setForeground(Color.lightGray);
        jp.add(l9);

    JLabel l1=new JLabel("Name ");
    l1.setBounds(50,50,150,30);
    l1.setFont(new Font("serif",Font.BOLD,16));
    l1.setForeground(Color.lightGray);
    jp.add(l1);
    T1=new JTextField();
    T1.setBounds(200,50,150,30);
    T1.setBackground(new Color(16,108,115));
    T1.setFont(new Font("Tahoma",Font.PLAIN,16));
    T1.setForeground(Color.lightGray);
    jp.add(T1);

        JLabel l2=new JLabel("Age ");
        l2.setBounds(50,100,150,30);
        l2.setFont(new Font("serif",Font.BOLD,16));
        l2.setForeground(Color.lightGray);
        jp.add(l2);
        T2=new JTextField();
        T2.setBackground(new Color(16,108,115));
        T2.setBounds(200,100,150,30);
        T2.setFont(new Font("Tahoma",Font.PLAIN,16));
        T1.setBackground(new Color(16,108,115));
        T2.setForeground(Color.lightGray);
        jp.add(T2);

        JLabel l3=new JLabel("Gender");
        l3.setBounds(50,150,150,30);
        l3.setFont(new Font("serif",Font.BOLD,16));
        l3.setForeground(Color.lightGray);
        jp.add(l3);
        rbm=new JRadioButton("Male");
        rbm.setBounds(200,150,100,30);
        rbm.setBackground(new Color(16,108,115));
        rbm.setFont(new Font("Tahoma",Font.BOLD,16));
        rbm.setForeground(Color.lightGray);
        jp.add(rbm);
        rbf=new JRadioButton("Female");
        rbf.setBounds(300,150,100,30);
        rbf.setBackground(new Color(16,108,115));
        rbf.setFont(new Font("Tahoma",Font.BOLD,16));
        rbf.setForeground(Color.lightGray);
        jp.add(rbf);

        JLabel l4=new JLabel("Job ");
        l4.setBounds(50,200,150,30);
        l4.setFont(new Font("serif",Font.BOLD,16));
        l4.setForeground(Color.lightGray);
        jp.add(l4);
        C1=new JComboBox(new String []{"Front Desk","Housekeeping","Kitchen staff","Room service","Manager","Accounatant","Chef"});
        C1.setBounds(200,200,150,30);
        C1.setBackground(new Color(16,108,115));
        C1.setFont(new Font("Tahoma",Font.PLAIN,16));
        C1.setForeground(Color.lightGray);
        jp.add(C1);

        JLabel l5=new JLabel("Salary ");
        l5.setBounds(50,250,150,30);
        l5.setFont(new Font("serif",Font.BOLD,16));
        l5.setForeground(Color.lightGray);
        jp.add(l5);
        T3=new JTextField();
        T3.setBounds(200,250,150,30);
        T3.setFont(new Font("Tahoma",Font.PLAIN,16));
        T3.setBackground(new Color(16,108,115));
        T3.setForeground(Color.lightGray);
        jp.add(T3);

        JLabel l6=new JLabel("Phone ");
        l6.setBounds(50,300,150,30);
        l6.setFont(new Font("serif",Font.BOLD,16));
        l6.setForeground(Color.lightGray);
        jp.add(l6);
        T4=new JTextField();
        T4.setBounds(200,300,150,30);
        T4.setFont(new Font("Tahoma",Font.PLAIN,16));
        T4.setBackground(new Color(16,108,115));
        T4.setForeground(Color.lightGray);
        jp.add(T4);

        JLabel l7=new JLabel("Aadhar ");
        l7.setBounds(50,350,150,30);
        l7.setFont(new Font("Tahoma",Font.BOLD,16));
        l7.setForeground(Color.lightGray);
        jp.add(l7);
        T5=new JTextField();
        T5.setBounds(200,350,150,30);
        T5.setFont(new Font("Tahoma",Font.PLAIN,16));
        T5.setBackground(new Color(16,108,115));
        T5.setForeground(Color.lightGray);
        jp.add(T5);

        JLabel l8=new JLabel("Email ");
        l8.setBounds(50,400,150,30);
        l8.setFont(new Font("serif",Font.BOLD,16));
        l8.setForeground(Color.lightGray);
        jp.add(l8);
        T6=new JTextField();
        T6.setBounds(200,400,150,30);
        T6.setFont(new Font("Tahoma",Font.PLAIN,16));
        T6.setForeground(Color.lightGray);
        T6.setBackground(new Color(16,108,115));
        jp.add(T6);


        badd=new JButton("Add ");
        badd.setBounds(50,500,110,30);
        badd.setFont(new Font("Tahoma",Font.BOLD,16));
        badd.setForeground(Color.lightGray);
        badd.setBackground(Color.BLACK);
        badd.addActionListener(this);
        jp.add(badd);

        bback=new JButton("Back ");
        bback.setBounds(200,500,110,30);
        bback.setFont(new Font("Tahoma",Font.BOLD,16));
        bback.setForeground(Color.lightGray);
        bback.setBackground(Color.BLACK);
        bback.addActionListener(this);
        jp.add(bback);

        ImageIcon imgi1=new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image i=imgi1.getImage().getScaledInstance(280,280,Image.SCALE_DEFAULT);
        ImageIcon imgi2=new ImageIcon(i);
        JLabel l13=new JLabel(imgi2);
        l13.setBounds(420,70,280,280);//same as frame height
        jp.add(l13);
    setUndecorated(true);
    setLocation(500,100);
    setLayout(null);
    setSize(795,610);
    setVisible(true);
}
    public static void main(String[] args) {
        new Addemp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==badd){
    try{
        Sqlconnection s=new Sqlconnection();
        String name=T1.getText();
        String age=T2.getText();

        String salary=T3.getText();
        String job=(String) C1.getSelectedItem();
        String phone=T4.getText();
        String aadhar=T5.getText();
        String email=T6.getText();
        String gender=null;
        if(rbm.isSelected()){
            gender="Male";
        }else if(rbf.isSelected()){
            gender="Female";
        }

        String q="Insert into Employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
        s.State.executeUpdate(q);

        JOptionPane.showMessageDialog(null,"employee Successfully added");
        this.setVisible(false);
    }catch(Exception E){
        E.printStackTrace();}
}else{setVisible(false);}
    }
}
