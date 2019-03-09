public class Counter { 
   
// Make a class that holds a # that can be decreased & increased
// the counter also has an *optional check* that prevents the counter from going below 0
    
    private int newCounter; 
    private boolean check; 
    
    public Counter(int startingValue, boolean check) {
        // creates a new counter with the given value. The check is on if parameter is true.
        this.newCounter = startingValue; 
        this.check = check; 
    }
    
    public Counter (int startingValue) {
        //creates new counter w/ given value & check is off 
        this(startingValue, false);    
    }
    
    public Counter (boolean check) {
        // creates new counter w/ starting value of 0 & check is on (if parameter is true) 
        this(0, true);  
    }
    
    public Counter() {
        // creates new counter w/ starting value of 0 & check is off 
        this(0, false);  
    }
    
    public int value() {    
        // returns current value of counter 
        return this.newCounter;  
    }
    
    public void increase() {
        // increases by 1 
        increase(1); 
    }
    
    public void decrease() {
        // decreases value of counter by 1, but not below 0 if check is on  
       decrease(1);
    }
    
    public void increase(int increaseAmount) {
        // increases value by amt of parameter (if amt is neg, value will not change)
        if (increaseAmount>0) {
            this.newCounter += increaseAmount; 
        }
    }
   
    public void decrease(int decreaseAmount) {
        // decreases value of counter by amt of parameter (but not below 0 if check is on) 
        // if decreaseAmt is neg, value will not change
        if (decreaseAmount<0) {  
            return;
        }
        this.newCounter -= decreaseAmount; 
        if (this.check && this.newCounter < 0) { // this.check==true is unnecessary 
            this.newCounter = 0; 
        }
    }
}

