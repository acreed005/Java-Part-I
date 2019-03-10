public class Student {
    
    private String name; 
    private String studentNumber; 
    
    public Student(String name, String studentNumber) {
        // initializes name & student number w/ given parameters 
        this.name = name; 
        this.studentNumber = studentNumber; 
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getStudentNumber() {
        return this.studentNumber;
    }
    
    public String toString() {
        // returns Pekka Mikkola (013141590)
        return name + " (" + studentNumber + ")";
    }
}
