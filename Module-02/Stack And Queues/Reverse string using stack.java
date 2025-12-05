import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++) {
            st.push(str.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0) {
            sb.append(st.pop());
        }
        
        System.out.println(sb.toString());
    }
}
