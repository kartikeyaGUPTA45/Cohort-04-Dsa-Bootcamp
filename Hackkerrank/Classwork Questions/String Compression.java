import java.io.*;
import java.util.*;

public class Solution {
    
    public static StringBuilder compression1(String str) {
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        
        for(int i=1;i<str.length();i++) {
            char ch = str.charAt(i);
            char lastCh = ans.charAt(ans.length()-1);
            
            if (ch != lastCh) {
                ans.append(ch);
            }
        }
        
        return ans;
    }
    
    public static StringBuilder compression2(String str) {
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        int count = 1;
        
        for(int i=1;i<str.length();i++) {
            char ch = str.charAt(i);
            char lastCh = ans.charAt(ans.length()-1);
            
            if (ch == lastCh) {
                count+=1;
            } else {
                if (count != 1) {
                    ans.append(count);
                }
                ans.append(ch);
                count = 1;
            }
        }
        
        if (count != 1) {
            ans.append(count);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
