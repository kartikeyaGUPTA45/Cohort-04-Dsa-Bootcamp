import java.io.*;
import java.util.*;

public class Solution {
    
    public static void spiralPattern(int arr[][], int n, int m) {
        int rmin = 0, cmin = 0;
        int rmax = n-1, cmax = m-1;
        int count = 0;
        
        while(count < (n*m)) {
            
            for(int r = rmin; r <= rmax && count < (n*m); r++) {
                System.out.println(arr[r][cmin]);
                count++;
            }
            
            cmin++;
            
            for(int c = cmin; c <= cmax && count < (n*m); c++) {
                System.out.println(arr[rmax][c]);
                count++;
            }
            
            rmax--;
            
            for(int r = rmax; r >= rmin && count < (n*m); r--) {
                System.out.println(arr[r][cmax]);
                count++;
            }
            
            cmax--;
            
            for(int c = cmax; c >= cmin && count < (n*m); c--) {
                System.out.println(arr[rmin][c]);
                count++;
            }
            
            rmin++;
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        spiralPattern(arr,n,m);
    }
}
