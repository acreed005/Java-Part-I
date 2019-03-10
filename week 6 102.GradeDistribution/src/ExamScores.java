import java.util.ArrayList;
import java.util.Scanner;

// class consists of grade distribution 
// if the score is not within the range 0-60 it is not taken into account
/*  0 - 29 fail
    30 - 34 =1 
    35 - 39 =2
    40 - 44 =3
    45 - 49 =4
    50 - 60 =5
*/ 

public class ExamScores {
    
    private ArrayList<Integer> numbers; 
    
    public ExamScores(Scanner reader) {
        this.numbers = new ArrayList<Integer>();
    }    
   
    public void add(int integer) {
        if (integer >= 0 && integer <= 60) {
            numbers.add(integer);
        }
    }
    
    private int gradeNumber(int integer) {
        if (integer <= 29) {
            return 0; 
        } else if (integer <= 34 && integer >= 30) {
            return 1; 
        } else if (integer <= 39 && integer >= 35) {
            return 2; 
        } else if (integer <= 44 && integer >= 40) {
            return 3; 
        } else if (integer <= 49 && integer >= 45) {
            return 4; 
        } 
        return 5;
    }
    
    public void distribution() {
        System.out.println("Grade Distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");   
            for(int y : this.numbers) {
                int amt = gradeNumber(y); 
                if (amt==i) {
                    printsStars();
                }
            }
            System.out.println("");
        }      
        System.out.print("Acceptance percentage: " + acceptancePercentage() + "\n");
    } 
    
    private void printsStars() {
        System.out.print("*");
    }
    
    private double acceptancePercentage() {        
        int accept = 0;
        int notAccepted = 0;
        for(int y : this.numbers) {
            if(y > 29) {
                accept+=1; 
            } 
        } 
        return 100*((double)accept/this.numbers.size()); 
    }
}
