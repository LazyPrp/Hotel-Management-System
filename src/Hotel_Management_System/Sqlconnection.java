package Hotel_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sqlconnection {
Connection con;
Statement State;
public Sqlconnection(){
    try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/HMSystem","root","hello123");
        State=con.createStatement();

    } catch(Exception e){
        e.printStackTrace();
    }
}

}
