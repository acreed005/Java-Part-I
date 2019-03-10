public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        } else if (this.year == compared.year && this.month < compared.month) {
            return true;
        } else if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here 
     */
    public int differneceInYears(MyDate compared) {
        // calculates difference in yrs of obj 
        MyDate x = new MyDate(this.day, this.month, this.year); 
        
        int yearDiff = this.year-compared.year; 
        int monthDiff = this.month-compared.month; 
        
        if (x.earlier(compared)) {
            yearDiff *= -1; 
            if (yearDiff > 0) {
                if (this.month>compared.month || monthDiff==0 && this.day>compared.day ) {
                    return yearDiff -1; 
                }
            }
        } else {
            if (yearDiff > 0) {
                if (this.month<compared.month || monthDiff==0 && this.day<compared.day) {
                    return yearDiff-1; 
                }
           }
        }               
        return yearDiff; 
    }
}
