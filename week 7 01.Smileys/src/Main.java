public class Main {
    
    public static void main(String[] args) {
        printWithSmileys("Metho");
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
        // print parameter string surrounded by smileys 
        // 3 rows 
        // middle row is the word with a space before & after 
        // if character length is odd, add an extra space on the R side 
        
        int length = stringLength(characterString);
        
        printBorder(length); 
        printMiddle(characterString);   
        printBorder(length);
    }
    
    private static int stringLength(String characterString) {
        int length = characterString.length(); 
        if (length%2==0) {
            return length += 2; 
        } 
        return length += 3;
    }
    
    private static void printMiddle(String characterString) {
        if(!(characterString.length()%2==0)) { 
           System.out.println(":) " + characterString + "  :)"); 
        } else {
            System.out.println(":) " + characterString + " :)");
        }    
    }
    
    private static void printBorder(int length) {
        System.out.print(":)");
        for(int i = 0; i < length/2; i++) { // must divide by 2 because a smiley takes up 2 spaces 
            System.out.print(":)");
        }
        System.out.println(":)");
    }
}
