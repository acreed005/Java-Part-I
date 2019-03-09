public class Main {
    public static void main(String[] args) {
        Counter x = new Counter(9, true);
        
        x.decrease();
        x.decrease();
        x.decrease();
        System.out.println(x.value()); 
    }
}
