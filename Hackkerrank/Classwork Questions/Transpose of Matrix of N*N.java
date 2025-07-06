import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printArray(int arr[][], int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int arr[][], int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        printArray(arr,n);
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
        
        transposeMatrix(arr,n);
    }
}
