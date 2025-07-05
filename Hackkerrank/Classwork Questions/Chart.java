import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printChart(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            max = Math.max(max, arr[i]);
        }
        
        for(int i=max;i>=1;i--) {
            for(int j=0;j<n;j++) {
                if (i > arr[j]) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        printChart(arr,n);
    }
}
