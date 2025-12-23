package org.example.create;


import java.sql.*;
import java.util.Scanner;

import org.example.methods.Methods;

public class create {
    Connection con;

    {
        try {

            Scanner sc=new Scanner(System.in);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revision","root","sayanghosh_31_");
            Statement st=con.createStatement();

            String sql="insert into accounts (name,balance,pin)values(?,?,?);";
            PreparedStatement pst=con.prepareStatement(sql);

            System.out.println("Enter your name : ");
            String name=sc.nextLine();
            System.out.println("Enter your balance : ");
            int bal=sc.nextInt();
            System.out.println("Autogenerating unique pin...");
            String pin=String.valueOf(Methods.getPin());
            System.out.println("pin genration sucessful!!!");

            pst.setString(1,name);
            pst.setInt(2,bal);
            pst.setString(3,pin);
            pst.execute();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
