/*
 * VendingMachineDriver.java
 * Hunter Quantz
 * 
 * This program is the driver for the VendingMachine.java class
 */
package vendingmachinedriver;

import java.util.Scanner;

public class VendingMachineDriver {

    public static void main(String[] args) {
        int quantity; //stores the quantity added
        Scanner stdIn = new Scanner(System.in);
        VendingMachine mountainDew = new VendingMachine("Mountain Dew", 1.50, 25);
        VendingMachine water = new VendingMachine("water", 1.00, 15);
        VendingMachine appleJuice = new VendingMachine("Apple juice", 2.00, 20);

        System.out.println("Module 3 Competency by Hunter Quantz\n");
        System.out.println("Starting inventory:");

        mountainDew.displayItem();
        water.displayItem();
        appleJuice.displayItem();

        System.out.print("\nHow many bottles of Mountain Dew are you delivering? ");
        quantity = stdIn.nextInt();
        mountainDew.addStock(quantity);
        System.out.print("How many bottles of water are you delivering? ");
        quantity = stdIn.nextInt();
        water.addStock(quantity);
        System.out.print("How many bottles of Apple juice are you delivering? ");
        quantity = stdIn.nextInt();
        appleJuice.addStock(quantity);

        System.out.println("\nCurrent Inventory:");
        mountainDew.displayItem();
        water.displayItem();
        appleJuice.displayItem();

    }//end main

}//end VendingMachineDriver Class
