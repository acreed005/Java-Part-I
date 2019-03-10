public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // goes through each cell in array (given by parameter) & prints stars 
        // first row prints 5 stars, next row prints 1 star, etc
        for(int i = 0; i < array.length; i++) { 
            int index = array[i];
            for(int x = 1; x <= index; x++) {
                System.out.print("*");
            }
            System.out.println("");
        } 
    }
}
