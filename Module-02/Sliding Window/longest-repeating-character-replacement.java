import java.io.*;
import java.util.*;

public class Solution {
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i= 0 ,j= 0 ,maxFreq = 0, ans = 0;

        while(i< s.length()) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            while((i-j+1)-maxFreq > k) {
                System.out.println(i + " " + j);
                char ch1 = s.charAt(j);
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
        int k = scn.nextInt();
        
        System.out.println(characterReplacement(str, k));
    }
}
