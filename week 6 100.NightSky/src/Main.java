public class Main {

    public static void main(String[] args) {
        // The sky has a star density. If the density is e.g. 0.1, roughly 10% of the sky is covered with stars
        // stars print out as * characters
        
        NightSky NightSky = new NightSky(2, 2);
        NightSky.print();
        System.out.println("Number of Stars: " + NightSky.starsInLastPrint());
    }
}
