import java.io.*;
import java.util.*;

public class Solution {
    
    public static int goodString(String s) {
        int i = 0,j = 0,ans = 0;
        
        while(j <s.length()) {
            if (j-i+1 == 3) {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i+1);
                char ch3 = s.charAt(i+2);
                
                if (ch1 != ch2  && ch2 != ch3 && ch1 != ch3) {
                    ans+=1;
                }
                i++;
            }
            j++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        System.out.println(goodString(s));
    }
}
