import java.io.*;
import java.util.*;

public class Solution {
    
    public static int lswrc(String str) {
        int i = 0,j = 0, ans = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(i < str.length()) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            
            while(map.get(ch) > 1) {
                char ch1 = str.charAt(j);
                map.put(ch1, map.get(ch1)-1);
                j++;
            }
            
            ans = Math.max(ans, i-j+1);
            i++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(lswrc(str));
    }
}
