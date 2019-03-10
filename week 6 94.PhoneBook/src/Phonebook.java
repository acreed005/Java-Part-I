import java.util.ArrayList;

public class Phonebook {
    
    private ArrayList<Person> list;  
    
    public Phonebook() {
        this.list = new ArrayList<Person>(); 
    }
    
    public void add(String name, String number) { 
        // creates Person obj & adds to array
        this.list.add(new Person(name, number));
    }
    
    public void printAll() {
        // prints everyone in the phonebook 
        for (Person x : this.list) {
            System.out.println(x);
        }
    }
  
    public String searchNumber(String name) {
        // return number that correlates with name 
        for (Person x : this.list) {  
            if (x.getName().equals(name)) { 
                return x.getNumber();
            }
        }  
        return "number not found";             
    }
}
