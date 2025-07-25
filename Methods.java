package org.example;
import java.util.Random;
import java.util.Scanner;
public class Methods {
    public int getPin(){
        System.out.println("enter pin of 6 digits :");
        Scanner scan=new Scanner(System.in);
        int pin=scan.nextInt();
        if(pin>=100000 && pin<=999999){
            return pin;
        }
        else{
            System.out.println("error!!! enter a valid 6 digit pin.");
            return getPin();
        }
    }
}
