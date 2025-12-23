package org.example;

import org.example.add.addmoney;
import org.example.create.create;
import org.example.delete.delete;
import org.example.show.show;
import org.example.show.showall;
import org.example.withdraw.withdraw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){


        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("enter your choice what u want to do .");
            System.out.println(" 1.create account \n 2.withdraw money \n 3.add money ");
            System.out.println(" 4.show balance \n 5.delete account \n 6.show all accounts");
//            System.out.println(" ..any other keys for exiting.");
            String cont="";
            String s="";
            try{
                int choice=sc.nextInt();


            switch(choice) {
                case 1:
                    //create account
                    System.out.println("\ncreating account \n");
                    new create();
                    break;

                case 2:
                    //withdraw money
                    System.out.println("\nwithdrawing money\n");
                    new withdraw();
                    break;
                case 3:
                    //add money
                    System.out.println("\nadding money\n");
                    new addmoney();
                    break;
                case 4:
                    //show balance
                    System.out.println("\nshowing balance\n");
                    new show();
                    break;
                case 5:
                    //delete account
                    System.out.println("\ndeleting account\n");
                    new delete();
                    break;
                case 6:
                    //show all accounts
                    System.out.println("\nshowing all accounts\n");
                    new showall();
                    break;
                default:
                    System.out.println("Invalid input");
            }
                System.out.println("if u don't want to continue type n ");


                cont = sc.next();
                System.out.println();
            }

                        catch(InputMismatchException e){
                    System.out.println("Invalid input");
                    System.out.println("if u don't want to continue type n ");
                    sc.nextLine();
                    s=sc.nextLine();

                }

//            if(sc.hasNextLine()) {
//                cont = sc.nextLine();
//            }else{
//                cont = sc.nextLine();
//            }

            if (cont.equals("n") || s.equals("n")) {
                break;
            }


        }while(true);
    }
}