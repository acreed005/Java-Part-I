public class Clock {
    private final BoundedCounter hours;
    private final BoundedCounter minutes; 
    private final BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes & seconds are created & set to have the correct initial value 
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59); 
        this.seconds = new BoundedCounter(59);
        
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one sec
        this.seconds.next();
        if (this.seconds.getValue()==0) {  
            this.minutes.next();
            if (this.minutes.getValue()==0) {  
                this.hours.next(); // 00:00:00 
            }
        }
    }
    
    public String toString() {
        return this.hours + ":" + this.minutes+ ":" + this.seconds;
    }
}
