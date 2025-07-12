import java.io.*;
import java.util.*;

public class Solution {
    
    public static void fillRowAndCol(int arr[][], int m, int n, int row, int col) {
        for(int j=0;j<n;j++) {
            if (arr[row][j] == 0) arr[row][j] = -1;
        }
        
        for(int i=0;i<m;i++) {
            if (arr[i][col] == 0) arr[i][col] = -1;
        }
    }
    
    
    public static void modifyTheMatrix(int arr[][], int m, int n) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (arr[i][j] == 1) {
                    fillRowAndCol(arr,m,n,i,j);
                }
            }
        }
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 1;
                }
            }
        }
    }
    
    public static void display(int arr[][], int m, int n) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        
        int arr[][] = new int[m][n];
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        modifyTheMatrix(arr,m,n);
        display(arr,m,n);
    }
}
