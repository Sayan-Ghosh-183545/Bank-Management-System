package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int desc;
        Scanner scan=new Scanner(System.in);
        System.out.println("ATM MACHINE");
        do{
            System.out.println("Choose\n 0. new user. \n 1.existing user. \n 2.exit. ");
            int choice = scan.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("new user");
                    int pin =new Methods().getPin(); //unique pin required..need to fix someting for that.
                    System.out.println("new user's name :");
                    String name = scan.next();
                    System.out.println("do you want to deposit money now?(y/n)");
                    String yn = scan.next();
                    if (yn.equals("y")) {
                        System.out.println("enter amount you want to deposit :");
                        int bal = scan.nextInt();
                        new NewUser(pin, name, bal);
                    } else {
                        new NewUser(pin, name, 0);
                    }
                    System.out.println("Congrats!!! Your account has been created.");

                    break;
                case 1:
                    System.out.println("existing user");
                    new ExistingUser().todo();
                    break;
                case 2:
                    System.out.println("exit");
                    break;
            }
            System.out.println("0.Continue 1.Exit");
            desc = scan.nextInt();
        }while(desc==0);


        scan.close();
    }
}