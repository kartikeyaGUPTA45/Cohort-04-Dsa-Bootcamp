import java.io.*;
import java.util.*;

public class Solution {
    public static StringBuilder toggleCase(String str) {
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch-'a'+'A'); // c-'a' 99-97 + 65 = 67 => C
            } else {
                ch = (char)(ch-'A'+'a'); // C-'A'+'a' => 67 - 65 + 97 => 99 => c
            }
            
            ans.append(ch);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        System.out.println(toggleCase(str));
    }
}
