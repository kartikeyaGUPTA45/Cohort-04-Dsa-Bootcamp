import java.io.*;
import java.util.*;

public class Solution {
    
    public static String saddlePrice(int arr[][], int n) {
        
        for(int i=0;i<n;i++) {
            int minEle = arr[i][0];
            int col = 0;
            
            for(int j=1;j<n;j++) {
                if (minEle > arr[i][j]) {
                    minEle = arr[i][j];
                    col = j;
                }
            }
            
            boolean flag = true; // minEle is the maximum in the col
            
            for(int j=0;j<n;j++) {
                if (minEle < arr[j][col]) {
                    flag = false;
                    break;
                }
            }
            
            if (flag == true) {
                return String.valueOf(minEle);
            } 
        }
        
        return "Invalid input";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[][] = new int [n][n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(saddlePrice(arr,n));
    }
}
