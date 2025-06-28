import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printAlternateElements(int arr[]) {
        for(int i=0;i<arr.length;i+=2) {
            System.out.println(arr[i]);
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
        
        printAlternateElements(arr);
    }
}
