import java.util.*; 

public class Changer {
    
    private List<Change> list = new ArrayList<Change>(); 
    
    public void addChange(Change change) {
        // adds a new Change to the Changer         
        this.list.add(change);
    }

    public String change(String characterString) {
        // executes all added Changes for the character string in the order of their adding 
        for(Change x : this.list) {
            characterString = x.change(characterString);
        }
        return characterString;
    }
}
