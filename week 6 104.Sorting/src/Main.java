import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {44, 55, -1, 4, 3};
        System.out.println(smallest(array));
        System.out.println(indexOfTheSmallest(array));
        System.out.println(indexOfTheSmallestStartingFrom(array, 3));
        swap(array, 0, 4);
        System.out.println(Arrays.toString(array));
        
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values); // least to greatest 
        System.out.println(Arrays.toString(values));
    }
    
    public static int smallest(int[] array) {
        // returns smallest value in the array 
        // cannot change array that gets passed in parameter 
        int small = array[0]; 
        for (int x : array) { 
            // if cell # at index 0 > x (the numbers in the array) then 'small' becomes that cell # instead 
            if (small > x) { 
                small = x;
            } 
        }
        return small; 
    }
    
    public static int indexOfTheSmallest(int[] array) {
        // returns index of the smallest value in the array 
        int index = 0; 
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // returns smallest index starting at parameter index # 
        // array = {1, 4, 7, 3} 
        // ex: if index = 2, smallest cell is 3, returns index 4
        
        int[] arrayTwo = new int[array.length-index]; 
        for (int i = 0; i < array.length-index; i++) {
            arrayTwo[i] = array[index + i];
        }
        int smallestIndexFrom = indexOfTheSmallest(arrayTwo) + index; 
        return smallestIndexFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // swaps cells of indexes around 
        int index = array[index2];        
        array[index2] = array[index1]; // index1 becomes index2 
        array[index1] = index; // index2 becomes index1        
    }
    
    // selection sorting 
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int index = indexOfTheSmallestStartingFrom(array, i); 
            swap(array, i, index);
        }
    }   
}
