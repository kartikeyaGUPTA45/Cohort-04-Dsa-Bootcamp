import java.io.*;
import java.util.*;

public class Solution {
    
    public static String decToBinary(int n) {
        String ans = "";
        
        while(n > 0) {
            int rem = n%2;
            ans = (rem+"") + ans;
            n/=2;
        }
        return ans;   
    }
    
    public static boolean isPalindrome(String num) {
        int left = 0, right = num.length()-1;
        
        while(left <= right) {
            char chLeft = num.charAt(left);
            char chRight = num.charAt(right);
            
            if (chLeft != chRight) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    public static int palindromicSum(int N) {
        int ans = 1;
        for(int i=3;i<=N;i++) {
            String binary = decToBinary(i);
            if (isPalindrome(binary)) {
                ans += i;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  N = scn.nextInt();
        System.out.println(palindromicSum(N));
    }
}
