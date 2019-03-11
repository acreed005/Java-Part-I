
// carries things & max weight limit of things allowed in suitcase 

import java.util.ArrayList; 

public class Suitcase {    
    private int maxWeight; 
    private ArrayList<Thing> things; 
    
    public Suitcase(int weight) {
        this.maxWeight = weight; 
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        // adds thing (given by parameter) to your suitcase   
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }
    
     public void printThings() {
        // prints all the things in the suitcase 
        for (Thing x: this.things) {
            System.out.println(x); 
        }
    }
    
    public int totalWeight() {
        // finds total weight of items(things) in a suitcase
        int weight = 0; 
        for (Thing x : this.things) {
            weight += x.getWeight();
        }
        return weight; 
    }
    
    // this was originally one method that I had to divide into 2 ...
    // ... which was more simple than what I had previously  
    public Thing heaviestThing() {
        // returns the 'thing' that weighs the most
        // if empty, method returns null 
        for (Thing x: this.things) {
            if(x.getWeight()==heaviestWeight()) {
                return x;
            }
        }       
        return null; 
    }
    
    // helper method for heaviestThing()
    public int heaviestWeight() {
        // returns what amount the heaviest thing is 
        int heaviest = 0;
        for (Thing x: this.things) {
            if (x.getWeight() > heaviest) {
                heaviest = x.getWeight();  
            } 
        }
        return heaviest;
    }
    
    public String toString() {
        // returns a string in the form "x things (y kg)"
        // if suitcase is empty: 
        if (things.isEmpty()) {
            return "empty (0 kg)";    
        // if suitcase has 1 thing:
        } else if (things.size() == 1) {
            return "1 thing (" + totalWeight() + " kg)"; 
        }        
        return  this.things.size() + " things (" + totalWeight() + " kg)";
    }
}
