import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday; 
    
    public Person(String name, int day, int month, int year) {   
        this.name = name; 
        this.birthday = new MyDate(day, month, year);       
    }
        
    public Person(String name, MyDate birthday) { 
        this.name = name;
        this.birthday = birthday; 
    }

    public Person(String name) {
        // birthday becomes current day
        this.name = name; 
        
        Calendar x = Calendar.getInstance(); // same as below obj x is created to called get method 
        int day = x.get(Calendar.DATE);
        int mo = x.get(Calendar.MONTH); 
        int yr = x. get(Calendar.YEAR);
        this.birthday = new MyDate(day, mo , yr);       
    }

    public int age() {  
        // calculate age based todays date
        // you get the current day as follows: 
        int day = Calendar.getInstance().get(Calendar.DATE); 
        int mo = Calendar.getInstance().get(Calendar.MONTH) + 1; // january = 0
        int yr = Calendar.getInstance().get(Calendar.YEAR); 
        
        MyDate currentDay = new MyDate(day, mo, yr);   
        return currentDay.differneceInYears(this.birthday); 
    }
    
    public boolean olderThan(Person compared) { 
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
