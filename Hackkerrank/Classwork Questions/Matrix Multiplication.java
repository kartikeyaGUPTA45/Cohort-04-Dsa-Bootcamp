import java.io.*;
import java.util.*;

public class Solution {
    
    public static void matrixMultiplication(int a[][], int b[][]) {
        int n1 = a.length;
        int m1 = a[0].length;
        
        int n2 = b.length;
        int m2 = b[0].length;
        
        
        if (m1 != n2) {
            System.out.println("Invalid input");
            return;
        }
        
        int ans [][] = new int[n1][m2];
        
        for(int i=0;i<n1;i++) {
            for(int j=0;j<m2;j++) {
                for(int k=0;k<m1;k++) {
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        
        
        for(int i=0;i<n1;i++) {
            for(int j=0;j<m2;j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        
        int a[][] = new int[n1][m1];
        
        for(int i=0;i<n1;i++) {
            for(int j=0;j<m1;j++) {
                a[i][j] = scn.nextInt();
            }
        }
        
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        
        int b[][] = new int[n2][m2];
        
        for(int i=0;i<n2;i++) {
            for(int j=0;j<m2;j++) {
                b[i][j] = scn.nextInt();
            }
        }
        
        
        matrixMultiplication(a,b);
        
    }
}
