public class Main {

    public static void main(String[] args) {
        MyDate first = new MyDate(1, 1, 2011); 
        MyDate second = new MyDate (13, 3, 2012); 
        
        System.out.println(second.differenceInYears(first));
        
    }
}
