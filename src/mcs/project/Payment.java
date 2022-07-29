package mcs.project;

import java.util.Scanner;

public class Payment implements CashPay, CreditCardPay{
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
            charge = this.amount + 10;
        } else if (amount>=50 && amount<100) {
            charge = this.amount + 5;
        } else {
            charge = this.amount;
        }
        return charge;
    }

    public void cashPaymentDetails(double val) {
        setAmount(val);
        System.out.println("-------------------------------");
        System.out.println("The total paid amount after paying from cash is: " + "$" + deliverCharge(getAmount()));
    }

    public void CreditCardPaymentDetails(double val) {
        setAmount(val);
        System.out.println("-------------------------------");
        System.out.println("From which card will you pay: ");
        System.out.println("-------------------------------");
        System.out.println("1 - Master Card or Visit Card");
        System.out.println("2 - Amex Card");
        System.out.println("3 - Gift Card");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                this.amount = this.amount + (this.amount*1.5)/100;
                System.out.println("-------------------------------");
                System.out.println("The total paid amount after paying from Credit Card is: "+ deliverCharge(getAmount()));
                break;
            case 2:
                this.amount = this.amount + (this.amount*3)/100;
                System.out.println("-------------------------------");
                System.out.println("The total paid amount after paying from Credit Card is: "+ deliverCharge(getAmount()));
                break;
            case 3:
                System.out.println("-------------------------------");
                System.out.println("The total paid amount after paying from Credit Card is: "+ deliverCharge(getAmount()));
                break;
        }
    }

}

