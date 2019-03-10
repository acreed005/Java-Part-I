public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // prints numbers in the array on the same line
        // separate numbers with a comma & whitespace 
        // no comma should trail the last number
         
        for(int i = 0; i < array.length; i++) { // length=5 
            System.out.print(array[i]);
            if (i < array.length-1) { // prevents printing a comma after the last cell 
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
