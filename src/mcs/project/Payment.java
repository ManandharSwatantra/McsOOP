package mcs.project;

import java.util.Scanner;

public class Payment implements CashPay, CreditCardPay {
    double amount;
    double charge;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double deliverCharge(double amount) {
        if (amount < 50) {
            System.out.println("Delivery Charge: $10.");
            charge = this.amount + 10;
        } else if (amount >= 50 && amount < 100) {
            System.out.println("Delivery Charge: $5.");
            charge = this.amount + 5;
        } else {
            System.out.println("Delivery Cost is Free.");
            charge = this.amount;
        }
        return charge;
    }

    public void cashPaymentDetails(double val) {
        setAmount(val);
        System.out.println("-------------------------------------------------");
        System.out.println("The total payable amount is: " + "$" + deliverCharge(getAmount()));
    }

    public void CreditCardPaymentDetails(double val) {
        setAmount(val);
        System.out.println("-------------------------------------------------");
        System.out.println("From which card will you pay: ");
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Master Card");
        System.out.println("2 - Visit Card");
        System.out.println("3 - Amex Card");
        System.out.println("4 - Gift Card");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                this.amount = val + Math.round((val * 1.5) / 100);
                System.out.println("-------------------------------------------------");
                System.out.println("Master Card Selected.");
                System.out.println("-------------------------------------------------");
                System.out.println("Total Cost: " + val);
                System.out.println("Card Charge: " + "$" + (val * 1.5) / 100);
                System.out.println("The total payable amount is: " + "$" + deliverCharge(getAmount()));
                break;
            case 2:
                this.amount = this.amount + (this.amount * 1.5) / 100;
                System.out.println("-------------------------------------------------");
                System.out.println("Visit Card Selected.");
                System.out.println("-------------------------------------------------");
                System.out.println("Total Cost: " + "$" + val);
                System.out.println("Card Charge: " + "$" + (val * 1.5) / 100);
                System.out.println("The total payable amount is: " + "$" + deliverCharge(getAmount()));
                break;
            case 3:
                this.amount = this.amount + (this.amount * 3) / 100;
                System.out.println("-------------------------------------------------");
                System.out.println("Amex Card Selected.");
                System.out.println("-------------------------------------------------");
                System.out.println("Total Cost: " + "$" + val);
                System.out.println("Card Charge: " + "$" + (val * 3) / 100);
                System.out.println("The total payable amount is: " + "$" + deliverCharge(getAmount()));
                break;
            case 4:
                System.out.println("-------------------------------------------------");
                System.out.println("Gift Card Selected.");
                System.out.println("-------------------------------------------------");
                System.out.println("Total Cost: " + "$" + val);
                System.out.println("Card Charge: FREE");
                System.out.println("The total payable amount is: " + "$" + deliverCharge(getAmount()));
                break;
        }
    }

}

