package mcs.project;

import java.util.Scanner;

public class CreditCardPayment extends Payment{
/*    CreditCardPayment(double val) {
        super(val);
    }*/
    public void paymentDetails(double val) {
        super.setAmount(val);
        System.out.println("From which card will you pay: ");
        System.out.println("-------------------------------");
        System.out.println("1 - Master Card or Visit Card");
        System.out.println("2 - Amex Card");
        System.out.println("3 - Gift Card");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                super.amount = this.amount + Math.round((this.amount*1.5)/100);
                System.out.println("The total paid amount after paying from credit card is: "+ super.getAmount());
                break;
            case 2:
                super.amount = this.amount + Math.round((this.amount*3)/100);
                System.out.println("The total paid amount after paying from credit card is: "+ super.getAmount());
                break;
            case 3:
                System.out.println("The total paid amount after paying from credit card is: "+ super.getAmount());
                break;
        }
    }
}
