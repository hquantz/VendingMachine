/*
 * VendingMachine.java
 * Hunter Quantz
 * 
 * This program has the variables and methods for the vending machines
 */
package vendingmachinedriver;

public class VendingMachine {
    private String name;//hold the name of the item
    private double price;//hold the price of the item
    private int quantity;//hold the quantity of the item
    
    public VendingMachine(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void displayItem(){
        System.out.printf("Name: %s, price: $%.2f, Quantity: %d%n", this.name, this.price, this.quantity);
    }
    
    public void addStock(int quantity){
        double value = quantity * this.price;//stores the value of the added goods
        
        System.out.printf("Recieved $%.2f of %s%n", value, this.name);
    }
}//end VendingMachine class
