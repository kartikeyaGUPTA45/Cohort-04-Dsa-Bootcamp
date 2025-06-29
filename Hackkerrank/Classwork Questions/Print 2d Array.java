import java.io.*;
import java.util.*;

public class Solution {
    
    public static void print2dArray(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Number of rows
        int m = scn.nextInt(); // Number of cols
        
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        print2dArray(arr);
    }
}
