import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printSubArrays(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                for(int k = i;k<=j;k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
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
        
        printSubArrays(arr);
    }
}
