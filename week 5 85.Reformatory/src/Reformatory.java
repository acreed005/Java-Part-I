public class Reformatory {
    
    private int measurement; 
    
    public Reformatory() {
        this.measurement = 0; 
    }

    public int weight(Person person) {
        // returns weight of person 
        this.measurement++; // takes note of when weight was measured 
        
       return person.getWeight();
    }
    
    public void feed(Person person) {
       // increases weight of Person given in the parameter by 1
        int weight = person.getWeight(); 
        person.setWeight(weight+1);  
    }
    
    public int totalWeightsMeasured() {
        // returns total # of times a weight has been measured 
        return this.measurement; 
    }
}
