package mcs.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double data;
        System.out.println("Please choose any one option to pay: ");
        System.out.println("-------------------------------");
        System.out.println("1 - Cash Payment");
        System.out.println("2 - Card Payment");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("You have selected the Cash Payment");
                System.out.println("Enter the amount to be paid: ");
                data = sc.nextDouble();
                CashPayment obj = new CashPayment();
                obj.setAmount(data);
                obj.paymentDetails(data);
                break;
            case 2:
                System.out.println("You have selected the Credit Card Payment");
                System.out.println("Enter the amount to be paid: ");
                data = sc.nextDouble();
                CreditCardPayment obj1 = new CreditCardPayment();
                obj1.paymentDetails(data);
        }
    }
}
