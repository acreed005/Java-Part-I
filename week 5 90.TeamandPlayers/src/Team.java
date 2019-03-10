import java.util.ArrayList; 

public class Team {
    private String teamName; 
    private ArrayList<Player> players;
    private int maxNumber;
    
    public Team(String name) {  
        this.teamName = name; 
        this.players = new ArrayList<Player>();      
        this.maxNumber = 16; 
    }
    
    public String getName() { 
        return this.teamName;
    }
    
    public void addPlayer(Player player) { 
        if (this.players.size() < this.maxNumber) {
            this.players.add(player);   
        }
    }
    
    public void printPlayers() { 
        for(Player p:this.players) {
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int maxSize) { 
        this.maxNumber = maxSize; 
    }
    
    public int size() { 
        return this.players.size();
    }   
    
    public int goals() { 
        int totalGoals = 0; 
        for (Player x: this.players) {
            totalGoals += x.goals(); 
        }
        return totalGoals; 
    }
}
