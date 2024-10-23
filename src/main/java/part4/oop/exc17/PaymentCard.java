package part4.oop.exc17;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (this.balance > 1 && this.balance - 2.60 > 0) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance > 1 && this.balance - 4.60 >= 0) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0 && this.balance > 0) {
            double tmp = 150.0;
            if (this.balance + amount < tmp) {
                this.balance += amount;
            } else {
                this.balance = tmp;
            }
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
