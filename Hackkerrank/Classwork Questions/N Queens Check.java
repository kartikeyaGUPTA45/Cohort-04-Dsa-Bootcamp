import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isCheck(int arr[][], int n, int row, int col) {
        // Left condition
        
        for(int j = col-1;j>=0;j--) {
            if (arr[row][j] == 1) {
                return true;
            }
        }
        
        
        // Right Condition
        for(int j=col+1;j<n;j++) {
            if (arr[row][j] == 1) {
                return true;
            }
        }
        
        // Up condition
        
        for(int i=row-1;i>=0;i--) {
            if (arr[i][col] == 1) {
                return true;
            }
        }
        
        // Down Condition
        for(int i=row+1;i<n;i++) {
            if (arr[i][col] == 1) {
                return true;
            }
        }
        
        // D1 condition
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if (arr[i][j] == 1) {
                return true;
            }
        }
        
        // D2 condition
        for(int i=row+1,j=col+1;i<n && j<n;i++,j++) {
            if (arr[i][j] == 1) {
                return true;
            }
        }
        
        // AD1 condition
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++) {
            if (arr[i][j] == 1) {
                return true;
            }
        }
        
        // AD2 condition
        for(int i=row+1,j=col-1;i<n && j>=0;i++,j--) {
            if (arr[i][j] == 1) {
                return true;
            }
        }
        
        return false;
    }
    
    public static String nQueens(int arr[][], int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if (arr[i][j] == 1) {
                    boolean ans = isCheck(arr,n,i,j);
                    if (ans == true) {
                        return "Danger";
                    }
                }
            }
        }
        
        return "N Queens";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(nQueens(arr,n));
    }
}
