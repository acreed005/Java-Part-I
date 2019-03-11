public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
       Container container = new Container(1000);
       addSuitcasesFullOfBricks(container);
       System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        // adds 100 suitcases into the container it receives as a parameter
        // there is one brick in each suitcase (brick is 4kg)         
        
        for (int weight = 1; weight <= 100; weight++) {
            Thing thing = new Thing("Brick", weight);
 
            Suitcase suitcase = new Suitcase(weight);
            suitcase.addThing(thing);
 
            container.addSuitcase(suitcase);
        }
    }
}
