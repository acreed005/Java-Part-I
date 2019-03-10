// star density is 10% of sky (0.1) 
// in this assignment we "hide" the nested loop within a method
import java.util.Random;

public class NightSky {
    
    private double density; 
    private int width; 
    private int height; 
    private int starsInLastPrint = 0;
    
    public NightSky(double density) {
        // creates a NightSky obj w/ given star density
        // width=20 & height=10
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height) {
        // creates a NightSky obj w/ given width & height
        // density = 0.1
        this(0.1, width, height);
    }
    
    public NightSky(double density, int width, int height) {
        // creates a NightSky-obj w/ given density, width & height
        this.density = density; 
        this.width = width; 
        this.height = height; 
    }
 
    public void printLine() { 
        // prints one line of stars
        // line length = this.width
        // star probability = this.density 
        Random ran = new Random(); 
        for(int i = 0; i < this.width; i++) {         
            double d = ran.nextDouble(); // next double means from 0 - 1? 
            if (d <= this.density) {  
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }            
        }
        System.out.println("");
    }
    
    public void print() { 
        // prints night sky of given size 
        // use printLine() to print each separate line of the sky 
        for(int i = 0; i < this.height; i++) {
            printLine(); 
        }
    }
    
    public int starsInLastPrint() {
        // returns number of stars printed in night sky    
        return this.starsInLastPrint;
    }
}
