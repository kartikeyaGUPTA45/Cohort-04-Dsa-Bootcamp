import java.io.*;
import java.util.*;

public class Solution {
    
    public static int [][] convert1DTo2D(int arr[], int p, int q, int n) {
        int count = 0;
        
        int ans [][]  = new int[p][q];
        
        for(int i=0;i<p;i++) {
            for(int j=0;j<q;j++) {
                ans[i][j] = arr[count];
                count++;
            }
        }
        
        return ans;
    }
    
    public static void display(int arr[][]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int p = scn.nextInt();
        int q = scn.nextInt();
        
        int ans [][] = convert1DTo2D(arr,p,q,n);
        display(ans);
    }
}
