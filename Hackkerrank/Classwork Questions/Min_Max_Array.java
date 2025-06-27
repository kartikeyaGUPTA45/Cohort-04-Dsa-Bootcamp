import java.io.*;
import java.util.*;

public class Solution {
    
    public static int minElementInArray(int arr[]) { // min in the array 
        int min = Integer.MAX_VALUE; //  Infinity // arr[0];
        
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
    
    public static int maxElementInArray(int arr[]) { // max in the array 
        int max = Integer.MIN_VALUE; // - Infinity // arr[0];
        
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    public static int maxMinElementInArray(int arr[]) {  
        int max = Integer.MIN_VALUE; // - Infinity // arr[0];
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return max-min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int maxValue = maxElementInArray(arr);
        int minValue = minElementInArray(arr);
        
        int span = maxValue - minValue;
        
        System.out.println(maxMinElementInArray(arr));
    }
}
