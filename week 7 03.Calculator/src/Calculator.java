import java.util.Scanner;

public class Calculator {
    
    private Reader reader; 
    private int calculations; 
    
    public Calculator() {
        this.reader = new Reader(); 
        this.calculations = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }  
    
    // sum(), difference(), product() repeat multiple times, a helper variable would help solve this 
    // I did not know to use an array, that is a good simple solution 
    
    private void sum() {
        calculations++;
        int[] array = helper();
        System.out.println("sum of the values " + (array[0] + array[1]));
    }
    
    private void difference() {
        calculations++;
        int[] array = helper();
        System.out.println("difference of the values " + (array[0] - array[1]));
    }
    
    private void product() {
        calculations++;
        int[] array = helper();
        System.out.println("difference of the values " + (array[0] * array[1]));
    }
    
    private void statistics() {
        System.out.println("Calculations done " + calculations);                
    }
    
    private int[] helper() {
        int[] array = new int[2];
        System.out.print("Value1: ");
        array[0] = reader.readInteger();
        System.out.print("Value2: ");
        array[1] = reader.readInteger();
        return array; 
    }
}
