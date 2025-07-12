import java.io.*;
import java.util.*;

public class Solution {
    
    public static int countPalindromicRows(int arr[][], int m, int n) {
        int ans = 0;
        for(int i=0;i<m;i++) {
            int left = 0, right = n-1;
            int flag = 1;
            
            while(left < right) {
                if (arr[i][left] != arr[i][right]) {
                    flag = 0;
                    break;
                }
                
                left++;
                right--;
            }
            
            if (flag == 1) ans += 1;
        }
        
        return ans;
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
        
        System.out.println(countPalindromicRows(arr,m,n));
        
    }
}
