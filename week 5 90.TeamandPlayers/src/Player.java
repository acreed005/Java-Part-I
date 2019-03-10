public class Player {
    private String name; 
    private int amountOfGoals; 
    
    public Player(String name) { 
        this(name, 0);
    }
    
    public Player(String name, int goals) { 
        this.name = name; 
        this.amountOfGoals = goals; 
    }
    
    public String getName() { 
        return this.name; 
    }
    
    public int goals() { 
        return this.amountOfGoals;
    }
    
    @Override 
    public String toString() { 
        return this.name + ", goals " + this.amountOfGoals;
    }
}
