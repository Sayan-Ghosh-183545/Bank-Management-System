package org.example.methods;

import java.sql.*;
import java.util.Scanner;

public class Execute {
    public boolean accCheck(int id,String pin){
        Connection con;

        {
            try
            {

                Scanner sc = new Scanner(System.in);
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revision", "root", "sayanghosh_31_");
                //Statement st=con.createStatement();


                String sql = "select * from accounts where id=? and pin=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                pst.setString(2, pin);
                ResultSet rs = pst.executeQuery();
                if(rs.next()) {
                    String name=rs.getString("name");
                    int bal=rs.getInt("balance");
                    System.out.println("WELCOME "+ name +" !!!");
                    System.out.println("Your account details - id : " + id + " , name : "+name+" , balance : "+ bal);
                    //System.out.println();
                    return true;
                }
                else {
                    System.out.println("incorrect id , pin or the pin doesn't match the acquired card id..");
                    System.out.println("TRY AGAIN !!!");
                    return false;
                }

        } catch(
                Exception e)

        {
            System.out.println(e);
            return false;
        }
    }
}}

