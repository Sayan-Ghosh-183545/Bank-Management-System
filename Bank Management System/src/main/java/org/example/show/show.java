package org.example.show;

import org.example.methods.Execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class show{

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

                }
            } catch(
                    Exception e)

            {
                System.out.println(e);
            }
        }
    }
