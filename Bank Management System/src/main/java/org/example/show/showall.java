package org.example.show;

import java.sql.*;
import java.util.Scanner;

public class showall {
    Connection con;

    {
        try{

            Scanner sc = new Scanner(System.in);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revision", "root", "sayanghosh_31_");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from accounts;");
            //System.out.println("\t" +name+"\t"+bal+"\t" +pin);
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int bal=rs.getInt(3);
                String pin=rs.getString(4);
                System.out.println(id+"\t" +name+"\t"+bal+"\t" +pin);

            }

            }
        catch (Exception e) {
            System.out.println(e);
        }

        }
    }


