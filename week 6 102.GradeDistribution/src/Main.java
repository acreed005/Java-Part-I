import java.util.Scanner;
import java.util.ArrayList;

public class Main {

// 1 scanner obj is allowed to call new Scanner (can call Scanner once)  
// scanner obj can pass as a parameter 
// if another obj needs a scanner, you can pass it as constructor parameter & save in instance variable
// do not use static variables 
 
    public static void main(String[] args) {     
        
        Scanner reader = new Scanner(System.in); 
        ExamScores grades = new ExamScores(reader); 
        
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int integer = Integer.parseInt(reader.nextLine());
            grades.add(integer);
            if (integer==-1) {
                break;
            }
        }
        grades.distribution();
    }
}
