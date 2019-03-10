import java.util.Arrays;

public class BinarySearch {
    
    public static boolean search(int[] array, int value) {
        // figures out if value given as a parameter is in the sorted array
        Arrays.sort(array);
        for(int i : array) {
            if(i==value) {
                return true;
            } 
        }
        return false; 
    }
}
