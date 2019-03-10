import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> bookList; 
       
    public Library() {
        this.bookList = new ArrayList<Book>();
    }
     
    public void addBook(Book newBook) {
        this.bookList.add(newBook);
    }
     
    public void printBooks() {
        for (Book list: this.bookList) {
             System.out.println(list); 
        }
    }
     
    public ArrayList<Book> searchByTitle(String title) {
         // returns books that contain the word "title" 
         ArrayList<Book> found = new ArrayList<Book>(); 
         for (Book list: this.bookList) {
             if (StringUtils.included(list.title(), title)) {
                 found.add(list);
             }
         }
         if(found.isEmpty()) {
             return null;
         }
         return found; 
     }
     
     public ArrayList<Book> searchByPublisher(String publisher) {
         ArrayList<Book> found = new ArrayList<Book>();
         for (Book book: this.bookList) {  
             if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
             }
         }
         if(found.isEmpty()) {
             return null;
         }
         return found;
     }
     
     public ArrayList<Book> searchByYear(int year) {
         ArrayList<Book> found = new ArrayList<Book>();
         for (Book list: this.bookList) {
             if (list.year()==year) {
                 found.add(list);
             }
         }
         if(found.isEmpty()) {
             return null;
         }
         return found; 
     }     
}
