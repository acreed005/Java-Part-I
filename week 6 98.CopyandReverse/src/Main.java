import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        copied[0] = 99;

        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        
        System.out.println("reverse: " + Arrays.toString(reverse));
    }
      
    public static int[] copy(int[] array) {
        // creates copy of the parameter
        // creates a new array 
        int[]copy = Arrays.copyOf(array, array.length); // copyOf(array copy, length)
        return copy; 
    } 
    
     public static int[] reverseCopy(int[] array) {
        // creates array w/ elements from parameter but in reversed order
        // parameter array must remain the same
        int[] copy = new int[array.length];
        for(int i = array.length-1, x = 0; i >= 0; i--, x++) {
            copy[i] = array[x];
        }
        return copy;
     }
}
