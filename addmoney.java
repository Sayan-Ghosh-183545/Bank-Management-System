package org.example.add;

import org.example.methods.Execute;

import java.sql.*;
import java.util.Scanner;

public class addmoney {
    Connection con;

    {
        try

        {

            Scanner sc = new Scanner(System.in);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revision", "root", "sayanghosh_31_");
            //Statement st=con.createStatement();

            System.out.println("Enter card id : ");
            int id = sc.nextInt();
            System.out.println("Enter pin :");
            String pin = sc.next();
            if(new Execute().accCheck(id,pin)){
                String sql = "select balance from accounts where id=?";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setInt(1,id);
                ResultSet rs= pst.executeQuery();
                rs.next();
                int bal=rs.getInt("balance");
                System.out.println("Available balance :"+bal);
                System.out.println("Enter the amount you want to add :");
                int add=sc.nextInt();

                System.out.println("Adding money successful\n");
                pst=con.prepareStatement("update accounts set balance=? where id=?");
                int newbal=bal+add;
                pst.setInt(1,newbal);
                pst.setInt(2,id);
                pst.execute();
            }
        } catch(
                Exception e)

        {
            System.out.println(e);
        }
    }
}

