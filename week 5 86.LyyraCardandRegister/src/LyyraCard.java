public class LyyraCard {

    private double balance; 

    public LyyraCard(double balance) {  
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }
 
    public boolean pay(double amount){ 
       // checks if the balance of the card is at least the amount given as parameter
       // if not, method returns false meaning that the card could not be used for the payment
       // if the balance is enough, the given amount is subtracted from the balance & true is returned
        if (this.balance<amount) {
            return false;  
        } 
        this.balance-=amount; 
        return true;
    }
}
