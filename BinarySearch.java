package Array;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;  // Return the index where the target element is found
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search in the right half of the array
            } else {
                high = mid - 1;  // Search in the left half of the array
            }
        }

        return -1;  // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        int resultIndex = binarySearch(arr, target);

        if (resultIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + resultIndex + " in the array.");
        }
    }
}
