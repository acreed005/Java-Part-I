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
        
        for(int i = 1; i <= 100; i++) {
            Suitcase s = new Suitcase(i);
            s.addThing(new Thing("Brick", 4));
            container.addSuitcase(s);
        }            
    }
}
