// stores name & weight 

public class Thing {
    
    private int weight; 
    private String name; 
    
    // constructor initializes weight & name of each item/thing 
    public Thing(String name, int weight) {
        this.weight = weight; 
        this.name = name; 
    }
    
    // weight for individual thing 
    public int getWeight() {
        // returns thing's weight 
        return this.weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    // ex: book (1 kg) 
    public String toString() {
        // The this prefix emphasizes that the call refers precisely to this object
        return this.name + "(" + this.weight + " kg)"; 
    }
}
