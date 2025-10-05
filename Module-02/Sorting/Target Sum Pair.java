import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printTargetSumPairs(int arr[], int tar, int n) {
        int i=0,j=n-1;
        
        while(i<j) {
            int sum = arr[i] + arr[j];
            
            if (sum == tar) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if (sum > tar) {
                j--;
            } else {
                i++;
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
        
        int tar = scn.nextInt();
        
        Arrays.sort(arr);
        
        printTargetSumPairs(arr, tar, n);
    }
}
