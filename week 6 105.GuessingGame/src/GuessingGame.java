import java.util.Scanner;

// guesses number player is thinking about (# between lower & upperlimit) 
// asks if number is greater than avg of 2 numbers 

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    // loop that stops once number has been guessed 
    public void play(int lowerLimit, int upperLimit) {
        instructions(upperLimit, lowerLimit);    
        int avg = 0;
        while (0 < (upperLimit-lowerLimit)) {  
            avg = average(upperLimit, lowerLimit);  
            // if the return for greater than method is true then lowerlimit becomes avg+1            
            if (isGreaterThan(avg)) { 
                lowerLimit = avg+1; 
            } else if (!isGreaterThan(avg)) {
                upperLimit = avg; 
            }           
        } 
        System.out.println("The number you're thinking of is " + avg);
    }
    
    public boolean isGreaterThan(int value) {
        System.out.println("is your number greater than " + value + "? (y/n)");
        String word = this.reader.nextLine();
        if(word.equals("y")) {
            return true;
        }
        return false; 
    }
     
    public int average(int first, int second) {
        // calculates avg of given values 
        // java rounds floating numbers down automatically 
        return (first+second)/2;
    }
    
    // skeleton that was provided 
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm of the given value
        // Below we swap the base number to base two logarithms
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
