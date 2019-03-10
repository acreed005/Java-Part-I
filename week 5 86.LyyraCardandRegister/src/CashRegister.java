public class CashRegister {

    private double cashInRegister;   
    private int economicalSold;      
    private int gourmetSold;         
    private static final double ECO_PRICE = 2.50; 
    private static final double GOUR_PRICE = 4; 

    public CashRegister() {
        // from the start, the register has 1000 euros
        this.cashInRegister = 1000; 
    }
   
    public double payEconomical(double cashGiven) {
        /*  if given cash >= 2.50:
            cashInRegister + 2.50 (lunch price) 
            economicalSold+1
            returns cashGiven - lunch price (cashgiven first to avoid negatives) 
        */
        // if given cash < 2.50, all is returned 
        if (cashGiven < ECO_PRICE) {
            return cashGiven; 
        }  
        this.cashInRegister+=cashGiven;
        this.economicalSold++;
        return cashGiven - ECO_PRICE; 
    }
 
    public double payGourmet(double cashGiven) {
        /*  if given cash >= 4.00:
            cashInRegister + 4.00 
            GourmetSold+1
            returns cashGiven - lunch price 
        */
        // if given cash < 4, all is returned 
        if (cashGiven < GOUR_PRICE) {
            return cashGiven; 
        }
        this.cashInRegister+=cashGiven; 
        this.gourmetSold++;
        return cashGiven - GOUR_PRICE;
    }
    
   // Extend the cash register with methods to charge a lunch price from a Lyyra Card (using a card instead of cash) 
    
    public boolean payEconomical(LyyraCard card) { 
        /*  if the balance of card >= 2.50:
            economicalSold+1
            returns true
        */ 
        double lyraCard = card.balance();
        if (lyraCard >= ECO_PRICE) {
            this.economicalSold++; 
            card.pay(ECO_PRICE); 
            return true; 
        }
       return false; 
    }
    
    public boolean payGourmet(LyyraCard card) {
        /*  if the balance of card >= 4.00:
            gourmetSold+1
            returns true
        */ 
        double lyraCard = card.balance(); 
        if (lyraCard >= GOUR_PRICE) {
            this.gourmetSold++;
            card.pay(GOUR_PRICE);
            return true;
        } 
        return false; 
    }
   
    public void loadMoneyToCard(LyyraCard card, double sum) {
       // when money is loaded to card, the amt stored in the register increases correspondingly
       // amt loaded to card must be > 0 
       if (sum>0) {           
          card.loadMoney(sum);
          this.cashInRegister+=sum;  
       }       
    }

    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + this.economicalSold+" gourmet lunches sold: " + this.gourmetSold;
    }
}
