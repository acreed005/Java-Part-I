import java.util.ArrayList;

public class Container {
    
    // obj variable list of suitcases & max Weight 
    private ArrayList<Suitcase> container; 
    private int maxWeight;  
    
    public Container(int weight) {
        this.container = new ArrayList<Suitcase>();
        this.maxWeight = weight; 
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) { 
            this.container.add(suitcase);
        } else {
            return; 
        }
    }
    
    // helper method to addSuitcase()
    public int totalWeight() {
        // finds weight of all the suitcases in 1 container 
        int weight = 0; 
        for (Suitcase x: this.container) {
            weight+= x.totalWeight();
        }
        return weight; 
    }
    
    public void printThings() {
        // prints things that are inside suitcases
        for (Suitcase x: this.container) {
            x.printThings();
        }      
    }

    public String toString() {
        if (this.container.isEmpty()) {
            return "empty (0 kg)";
        } else if (this.container.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg"; 
        }
        return this.container.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
