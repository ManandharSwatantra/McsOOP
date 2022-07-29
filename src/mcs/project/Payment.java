package mcs.project;


public class Payment {
    /*    Payment(double amount){
    this.amount = amount;
}*/
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

}

