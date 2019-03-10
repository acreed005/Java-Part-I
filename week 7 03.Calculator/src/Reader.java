import java.util.*;

public class Reader {
    
    // Scanner obj should be instance variable 
    
    private Scanner reader;
    
    public Reader() {
        this.reader = new Scanner(System.in);
    }
    
    public String readString() {
        return reader.nextLine();
    }
    
    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }
}
