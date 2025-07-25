package org.example;
import java.sql.*;
public class NewUser {
    public NewUser(int pin,String name,int balance){
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sayandb","root","sayanghosh_31_");
            PreparedStatement statement=connection.prepareStatement("insert into bms values(?,?,?);");
            statement.setInt(1,pin);
            statement.setString(2,name);
            statement.setInt(3,balance);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

