public class Main {

    public static void main(String[] args) {
        Apartment studio = new Apartment(1, 16, 5500);
        Apartment twoRooms = new Apartment(2, 38, 4200); 
        Apartment bronx = new Apartment(3, 78, 2500); // largest 

        System.out.println(studio.larger(twoRooms)); // is studio(16) > 2rooms(38)  
        System.out.println(bronx.larger(twoRooms)); // is bronx(78) > 2rooms(38) 
        
        System.out.println(studio.priceDifference(twoRooms));
        System.out.println(studio.moreExpensiveThan(twoRooms));

    }
}
