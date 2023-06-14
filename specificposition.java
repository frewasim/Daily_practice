package Array;
import java.util.Scanner;

public class speficpos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input of original array
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        System.out.println("Enter "+n+" number of elements:");
        for(int i=0 ;i <n ;i++){
            originalArray[i] = scanner.nextInt();
        }

        // Get the value to insert from the user
        System.out.print("Enter the value to insert: ");
        int valueToInsert = scanner.nextInt();

        // Get the position to insert from the user
        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();

        // Create a new array with increased size (increasing the size of new array)
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the value at the desired position
        newArray[position] = valueToInsert;

        // Copy elements after the insertion point
        for (int i = position; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        // Print the elements of the new array
        System.out.println("New array after insertion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        scanner.close();
    }
}
