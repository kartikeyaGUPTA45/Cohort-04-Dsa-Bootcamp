import java.io.*;
import java.util.*;

public class Solution {
    
    private static boolean checkBalanceBrackets(String str) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.size() == 0) {
                    return false; // More closing brackets 
                } else if (st.peek() == '(' && ch == ')') {
                    st.pop();
                } else if (st.peek() == '[' && ch == ']') {
                    st.pop();
                } else if (st.peek() == '{' && ch == '}') {
                    st.pop();
                } else {
                    return false; // Miss match
                }
            }
        }
        
        return (st.size() == 0); // More opening brackets
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(checkBalanceBrackets(str));
    }
}
