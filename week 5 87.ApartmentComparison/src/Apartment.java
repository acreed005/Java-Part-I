public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        // returns true if otherApartment > this 
        return this.squareMeters > otherApartment.squareMeters; 
    }
    
    private int price() {
        return pricePerSquareMeter * squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        // returns abs value of price diff of this & otherApartment 
        // price of an apartment = squareMeters * pricePerSquareMeter
        int thisObject = this.price(); 
        int otherObject = otherApartment.price();
        return Math.abs(thisObject-otherObject); 
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        // returns true if this > otherApartment 
        return this.price() > otherApartment.price(); 
    }
}
