import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[] sumOfArrays(int a1[], int a2[], int n1, int n2) {
        int n = Math.max(n1,n2)+1;
        int ans[] = new int[n];
        int i = n1-1,j=n2-1,k=n-1;
        int carry = 0;
        
        while(i >= 0 || j >= 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a1[i];
                i--;
            }
            
            if (j >= 0) {
                sum += a2[j];
                j--;
            }
            
            int rem = sum%10;
            int quo = sum/10;
            
            ans[k] = rem;
            k--;
            
            carry = quo;
        }
        
        ans[k] = carry;
        
        return ans;
    }
    
    public static void printAns(int ans[]) {
        int n = ans.length;
        
        int i=0;
        
        while(i<n && ans[i] == 0) {
            i++;
        }
        
        if (i == n) {
            System.out.println(0);
        }
        
        while(i<n) {
            System.out.println(ans[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1 [] = new int [n1];
        
        for(int i=0;i<n1;i++) {
            a1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int a2 [] = new int[n2];
        
        for(int i=0;i<n2;i++) {
            a2[i] = scn.nextInt();
        }
        
        int ans [] = sumOfArrays(a1,a2,n1,n2);
        printAns(ans);
    }
}
