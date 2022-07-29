package mcs.project;

public class CashPayment extends Payment {
/*    CashPayment(double val) {
        super(val);
    }*/
    public void paymentDetails(double val) {
        super.setAmount(val);
        System.out.println("The total paid amount after paying from cash is: "+ super.deliverCharge(super.getAmount()));
    }
}
