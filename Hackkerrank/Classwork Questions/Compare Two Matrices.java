import java.io.*;
import java.util.*;

public class Solution {

    public static String compareMatrices(int a[][], int b[][]) {
        int m1 = a.length;
        int n1 = a[0].length;
        
        int m2 = b.length;
        int n2 = b[0].length;
        
        if (m1 != m2 || n1 != n2) {
            return "Not Same";
        }
        
        for(int i=0;i<m1;i++) {
            for(int j=0;j<n2;j++) {
                if (a[i][j] != b[i][j]) {
                    return "Not Same";
                }
            }
        }
        
        return "Same";
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int m1 = scn.nextInt();
        int n1 = scn.nextInt();
        
        int a[][] = new int [m1][n1];
        
        for(int i=0;i<m1;i++) {
            for(int j=0;j<n1;j++) {
                a[i][j] = scn.nextInt();
            }
        }
        
        int m2 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int b[][] = new int [m2][n2];
        
        for(int i=0;i<m2;i++) {
            for(int j=0;j<n2;j++) {
                b[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(compareMatrices(a,b));
    }
}
