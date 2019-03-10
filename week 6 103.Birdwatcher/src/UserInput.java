import java.util.ArrayList; 
import java.util.Scanner;

/*
    Add - adds a bird
    Observation - adds an observation
    Statistics - prints all the birds
    Show - prints one bird
    Quit - terminates the program
*/

public class userInput {
    
    private ArrayList<BirdDatabase> birds; 
    private Scanner reader; 

    public userInput() {
        this.birds = new ArrayList<BirdDatabase>(); 
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            String input = trim(reader.nextLine()); // cleans up input to prevent confusion 
            if (input.equals("add")) {
                add();
            } else if (input.equals("observation")) {
                observation();
            } else if (input.equals("statistics")) {
                stats();
            } else if (input.equals("show")) {
                System.out.println(show());
            } else {
                break;
            }
        }
    }
    
    public void add() {
        System.out.print("Name: "); 
        String name = trim(this.reader.nextLine());
        
        System.out.print("Latin Name: ");
        String latin = trim(this.reader.nextLine());
        
        BirdDatabase bird = new BirdDatabase(name, latin);
        if(!this.birds.contains(bird)) {
            this.birds.add(bird);
        }       
    }
    
    public void observation() {
        System.out.print("What was observed:? ");
        String obs = trim(this.reader.nextLine());
        for (BirdDatabase bird : this.birds) {
            if (bird.getName().equals(obs)) {
                bird.addObersvation();
            }            
        }       
    }
    
    public void stats() {
        for(BirdDatabase bird: this.birds) {
            System.out.println(bird.toString());
        }
    }
    
    public String show() {
        System.out.print("What? ");
        String bird = trim(this.reader.nextLine()); 
        for(BirdDatabase b : this.birds) {
            if (b.getName().equals(bird)) {
                return b.getName() + " (" + b.getLatin() + "): " + b.observationNum() + " observations";
            } 
        }
        return "Is not a bird!";
    }
    
    private String trim(String word) {
        return word.toLowerCase().trim();
    }
}
