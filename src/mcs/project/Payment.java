package mcs.project;

import java.util.Scanner;

public class Payment {
    /*    Payment(double amount){
    this.amount = amount;
}*/
    double amount;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentDetails() {
        System.out.println("The total amount to pay is: " + this.amount);
    }
}

