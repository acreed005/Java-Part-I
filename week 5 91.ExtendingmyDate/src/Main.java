public class Main {

    public static void main(String[] args) {
        MyDate x = new MyDate(25, 2, 2011); 
        MyDate y = x.afterNumberOfDays(7);
        for (int i = 1; i <= 7; i++) { 
            System.out.println("Friday after " + i + " week is " + y);
            y = y.afterNumberOfDays(7);
        }
    }
}
