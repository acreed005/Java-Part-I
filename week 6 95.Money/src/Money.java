// best way to handle money is to dedicate a class to it 

public class Money {

    // final variables are immutable 
    private final int euros; 
    private final int cents; 

    // the comma mimicks a decimal pt 
    public Money(int euros, int cents) { 
        // ex: euros = 6 & cents = 120 (1.20 in cents) 
        if (cents > 99) { 
            euros += cents/100; // 6 = 6 + 120/100 = 6 + 1.2 = 7.2 
            cents %= 100; // (% is remainder) 0.2 = 0.2%100 = remainder = 0.20
        }
        this.euros = euros; 
        this.cents = cents; 
    }
    
    // compares one Member obj to another 
    public Money plus(Money added) { 
        // returns a new Money obj that has a value equal to the sum of obj (for which method called) & added    
        // obj c = sum of obj a + sum of obj b 
        int euros = this.euros + added.euros(); // ex: 5 + 4 = 9 
        int cents = this.cents + added.cents(); // ex: 50 + 30 = 80 
        if (cents > 99) { 
            cents -= 100; // ex: if cents is 120 then cents = 120 - 100 = 20 
            euros++; // & euros (4.00-1) = 5 -> 5.20  
        } 
        return new Money(euros , cents);      
    }
    
    public boolean less(Money compared) { 
        // returns true if this < compared
        if (this.euros < compared.euros) {
            return true;           
        } else if (this.euros==compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        // returns a new Money object that has a value equal to the obj for which the method was called minus decremented
        int e = this.euros - decremented.euros; 
        int c = this.cents - decremented.cents;
        if (this.euros >= decremented.euros) { // e > 0 
            if (this.cents >= decremented.cents) { // c > 0                  
                return new Money(e, c);         
            } else { // cannot subtract cents because they borrow from euros 
                int newC = -1*(100-this.cents - 100-decremented.cents); // this gives the correct subtraction amt                
                return new Money(e-1, newC); // must subtract euros by 1 
            }   
        }
        // e < 0 
        return new Money(0,0); // returns 0 instead of a neg
    }
    
    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
