package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;

public class Animate extends JFrame {
    Animate(){

        ImageIcon imgi1=new ImageIcon(ClassLoader.getSystemResource("icon/Raj.gif"));
        Image i5=imgi1.getImage().getScaledInstance(855,680,Image.SCALE_DEFAULT);
        ImageIcon imgi2=new ImageIcon(i5);

        JLabel l1=new JLabel(imgi2);
        l1.setBounds(0,0,858,680);//same as frame height
        add(l1);



        setLayout(null);
        setLocation(260,70);
       setSize(858,680);
       setVisible(true);

        try{
            Thread.sleep(5000);
            new login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Animate();
    }
}
