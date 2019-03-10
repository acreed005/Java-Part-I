public class BirdDatabase {

    // the database contains birds, each has a name & a Latin name
    // also tracks how many times each bird has been observed   
    // this class does not use user input (& shouldn't so it is more simple)
    
    private String name; 
    private String latin; 
    private int obs; 
    
    public BirdDatabase(String name, String latin) {
        this(name, latin, 0);
    }
    
    public BirdDatabase(String name, String latin, int obs) {
       this.name = name; 
       this.latin = latin; 
       this.obs = obs;
    } 
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.latin;
    }
    
    public void addObersvation() {
        this.obs++;
    }
    
    // specifically for "show" input
    public int observationNum() {
        return this.obs;
    }
    
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.obs + " observations";
    }
}
