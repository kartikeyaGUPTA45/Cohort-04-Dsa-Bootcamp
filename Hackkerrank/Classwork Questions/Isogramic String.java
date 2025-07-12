import java.io.*;
import java.util.*;

public class Solution {
    
    public static String IsIsogram(String str) {
        int freq[] = new int[26];
        
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            int index = ch-'a';
            freq[index]+=1;
        }
        
        for(int i=0;i<26;i++) {
            if (freq[i] > 1) {
                return "Not an Isogram";
            }
        }
        
        return "Isogram";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        System.out.println(IsIsogram(str));
    }
}
