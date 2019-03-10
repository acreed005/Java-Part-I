import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String input = reader.nextLine();
        System.out.println();

        boolean x = BinarySearch.search(array, Integer.parseInt(input));
        if (x) {
            System.out.println("Value " + input + " is in the array");
        } else if (!x) {
            System.out.println("Value " + input + " is not in the array");
        }
    }
}
