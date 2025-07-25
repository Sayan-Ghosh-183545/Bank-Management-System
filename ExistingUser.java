package org.example;

import java.sql.*;
import java.util.Scanner;

public class ExistingUser {
    Scanner scan=new Scanner(System.in);
    public ExistingUser(){

        System.out.println("enter pin :");
        int pin=scan.nextInt(); //get to understand whether the pin is a valid pin or not(maybeusiing hashset)

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sayandb","root","sayanghosh_31_");
            //PreparedStatement ps=connection.prepareStatement();
            Statement sta=connection.createStatement();
            ResultSet rs=sta.executeQuery("select * from bms where pin="+pin);
            rs.next();
            String name=rs.getString(2);
            int balance=rs.getInt(3);
            System.out.println("Welcome "+name+" ..how can we help you! ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void todo(){
        System.out.println("0. withdraw. \n 1.deposit. \n 2.check bank balance. \n 3.delete account. \n 4.exit. ");
        int choice = scan.nextInt();
    }


}
