public class Main {

    public static void main(String[] args) {
        Reformatory x = new Reformatory(); 
        Person brian = new Person("Brian", 1, 110, 7); // height & weight are in meters 
               
        System.out.println(brian.getName() + " weight: " + x.weight(brian)); 
        x.feed(brian);  
        x.feed(brian);
        System.out.println(x.weight(brian));
        System.out.println(x.totalWeightsMeasured());
    }
}
