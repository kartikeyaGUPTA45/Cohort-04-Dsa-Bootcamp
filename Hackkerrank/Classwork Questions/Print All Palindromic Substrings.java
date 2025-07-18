import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        
        while(left < right) {
            char chL = s.charAt(left);
            char chR = s.charAt(right);
            
            if (chL != chR) return false;
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void printAllPalindromicSubstring(String str) {
        for(int i=0;i<str.length();i++) {
            for(int j=i;j<str.length();j++) {
                String s = str.substring(i,j+1);
                if (isPalindrome(s)) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        printAllPalindromicSubstring(str);
    }
}
