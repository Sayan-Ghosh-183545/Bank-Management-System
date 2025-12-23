package org.example.delete;

import org.example.methods.Execute;

import java.sql.*;
import java.util.Scanner;

public class delete {
    static Scanner sc = new Scanner(System.in);
    static boolean areYouSure(){

        System.out.println("are you sure you want to delete this account?(y/n)");
        String sure=sc.next();
        return sure.equalsIgnoreCase("y");
    }

    Connection con;

    {
        try

        {


            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revision", "root", "sayanghosh_31_");
            //Statement st=con.createStatement();

            System.out.println("Enter card id : ");
            int id = sc.nextInt();
            System.out.println("Enter pin :");
            String pin = sc.next();
            if(new Execute().accCheck(id,pin) && areYouSure()){

                String sql = "delete from accounts where id=?";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setInt(1,id);
                pst.execute();
                System.out.println("account deleted successfully..");

            }
        } catch(
                Exception e)

        {
            System.out.println(e);
        }
    }
}


