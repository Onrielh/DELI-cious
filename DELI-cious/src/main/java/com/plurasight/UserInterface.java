package com.plurasight;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

     public static void homeScreen()  {
         System.out.println("\t Welcome to DELI-CIOUS");
         System.out.println("(1) Place a New Order");
         System.out.println("(2) Exit");
         int selection = scanner.nextInt();
         switch (selection){
             case 1: orderScreen();
             break;
             case 2: exitProgram();
                     break;
         }
    }
    public static void orderScreen(){
        System.out.println("Please select from the following");
        System.out.println("(1) Add Sandwich");
        System.out.println("(2) Signature Sandwiches");
        System.out.println("(3) Add Drink");
        System.out.println("(4) Add Chips");
        System.out.println("(5) Checkout");
        System.out.println("(6) Cancel Order");
       try{
           int selection = scanner.nextInt();

        switch (selection){
            case 1: addSandwich();
            break;
            case 2: SignatureSandwich;
            break;
            case 3: addDrink();
            break;
            case 4: addChip ();
            break;
            case 5: Checkout ();
            break;
            case 6: cancelOrder();
            break;
            default:
                System.out.println("Error:Invalid Entry, Please try again");
        }

}
       catch ();
}
