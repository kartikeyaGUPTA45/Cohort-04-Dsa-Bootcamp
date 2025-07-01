import java.io.*;
import java.util.*;

public class Solution {
    
    // Returning an array of 1D of integer type
    public static boolean [] createAnArray(){
        Scanner scn = new Scanner(System.in);
        int sizeOfArray = scn.nextInt();
        boolean arr[] = new boolean[sizeOfArray];
        // for(int i=0;i<sizeOfArray;i++) {
        //     arr[i] = scn.nextInt();
        // }
        
        return arr;
    }
    
    public static void printArrayElements(int arr[], int sizeOfArray) {
        for(int i=0;i<sizeOfArray;i++) {
            System.out.println("Element at " + i + "th index is : " + arr[i]);
        }
    }
    
    public static void printArrayElements2(boolean arr[]) {
        int sizeOfArray = arr.length;
        // System.out.println("Size of Array inside function: " + sizeOfArray);
        // System.out.println("Before Changing the array");
        for(int i=0;i<sizeOfArray;i++) {
            System.out.println("Element at " + i + "th index is : " + arr[i]);
        }
        
//         arr[9] = -100;
        
//         System.out.println("After changing the array");
        
//         for(int i=0;i<sizeOfArray;i++) {
//             System.out.println("Element at " + i + "th index is : " + arr[i]);
//         }
        
    }

    public static void main(String[] args) {
        boolean arr [] = createAnArray();
        // int sizeOfArray = arr.length; // It will give the size of an array 
        
        // System.out.println("Size of Array " + sizeOfArray);
        printArrayElements2(arr);
        
    }
}
