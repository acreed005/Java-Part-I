public class Main {
    
    public static void main(String[] args) {
        
        String word = "carrot";
        
        // Change class constructor instructs that when a new obj is created, parameters change a to b
        Change change1 = new Change('a', 'b');
        // word becomes new changed word 
        word = change1.change(word);

        System.out.println(word);

        // change2 is another obj that includes a new change parameter 
        Change Change2 = new Change('r', 'x');
        // word becomes changed word (w/ previous changes too) 
        word = Change2.change(word);

        System.out.println(word);
        
        // Changer obj uses Changer methods 
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));         
    }
}
