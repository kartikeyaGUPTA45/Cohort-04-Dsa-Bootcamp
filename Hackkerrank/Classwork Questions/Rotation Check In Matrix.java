import java.io.*;
import java.util.*;

public class Solution {
    
    public static String checkRotation(int arr[][], int n) {
        String str = "";
        
        for(int j=0;j<n;j++) {
            str += arr[0][j];
        }
        
        // str -> 123
        
        str += str;
        // str ->123123
        
        
        for(int i=1;i<n;i++) {
            String tempStr = "";
            for(int j=0;j<n;j++) {
                tempStr += arr[i][j];
            }
            
            // tempStr -> 312;
            
            if (str.indexOf(tempStr) == -1) {
                return "NO";
            }
        }
        
        return "YES";
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
        
        System.out.println(checkRotation(arr,n));
    }
}
