package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String itemName = "Apple";
        double itemPrice = 2.37;
        int quantity = 3;

        double totalPrice = itemPrice * quantity;

        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalPrice);

    }
}
