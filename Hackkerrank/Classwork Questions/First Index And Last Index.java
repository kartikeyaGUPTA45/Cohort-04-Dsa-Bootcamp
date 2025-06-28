import java.io.*;
import java.util.*;

public class Solution {
    
    public static int lastIndex(int arr[], int d) {
//         int last = -1;
        
//         for(int i=0;i<arr.length;i++) {
//             if (arr[i] == d) {
//                 last = i;
//             }
//         }
        
//         return last;
        
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] == d) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int firstIndex(int arr[], int d) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int [] findIndex(int arr[], int d) {
        int ans [] = new int [2];
        
//         for(int i=0;i<arr.length;i++) {
//             if (arr[i] == d) {
//                 ans[0] = i;
//                 break;
//             }
//         }
        
        
//         for(int i=arr.length-1;i>=0;i--) {
//             if (arr[i] == d) {
//                 ans[1] = i;
//                 break;
//             }
//         }
        
        ans[0] = -1;
        
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == d && ans[0] == -1) {
                ans[0] = i;
            }
            
            if (arr[i] == d) {
                ans[1] = i;
            }
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
        
        int d = scn.nextInt();
        
        // System.out.println(firstIndex(arr, d));
        // System.out.println(lastIndex(arr,d));
        
        int ans[] = findIndex(arr,d);
        
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
