import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printTheArray(int arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int[] countSort(int arr[], int n) {
        // Step - 01
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int ele : arr) {
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        
        //Step-02
        int range = max-min+1;
        
        // Step-03 
        int count[] = new int[range];
        
        // Step-04 
        for(int ele: arr) {
            int idx = ele - min;
            count[idx]+=1;
        }
        
        //Step-05
        for(int i=1;i<range;i++) {
            count[i] += count[i-1];
        }
        
        // Step-06
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--) {
            int val = arr[i];
            ans[count[val-min]-1] = val;
            count[val-min]-=1;
        }
        
        return ans;
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        arr = countSort(arr, n);
        printTheArray(arr, n);
    }
}
