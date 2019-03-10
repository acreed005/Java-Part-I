import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<Student>();       
        Scanner reader = new Scanner(System.in);       
        
        while (true) { 
            // loop asks for name & student number 
            // a new student obj is created using both inputs 
            // new Student objs are added to array of students "list"
            System.out.print("name: ");
            String name = reader.nextLine(); 
            if (name.isEmpty()) { 
                System.out.println("");
                break; 
            } 
            System.out.print("studentnumber: ");
            String number = reader.nextLine(); 
            list.add(new Student(name, number));                                 
        }
        System.out.println(""); // println() works too 
         
        for (Student student : list) {  
            System.out.println(student); 
        } 
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        
        for (Student student : list) {     
            if (student.getName().contains(term)) { 
                System.out.println(student);
            }
        }
    }          
}
