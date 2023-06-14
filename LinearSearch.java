package Array;
import java.io.*;
import java.util.Scanner;

public class LinearSearch{
    public static int linear_s(int arr[], int key, int n){
        for(int i = 0;i<n;i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter "+n+" th value:");
     for(int i=0;i<arr.length;i++)
     arr[i] = scan.nextInt();
    System.out.println("Enter the elemnt to search:");
    int target = scan.nextInt();
    for(int i = 0;i<arr.length;i++){
        if(arr[i] == target){
            System.out.println(target + " found! Atr position " + i);
            break;
        }
    }
    }
}