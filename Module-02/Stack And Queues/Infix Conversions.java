import java.io.*;
import java.util.*;

public class Solution {
    
    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else return 0;
    }
    
    private static void infixConversions(String exp) {
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while(st.peek() != '(') {
                    String preop2 = pre.pop();
                    String preop1 = pre.pop();
                    char optr = st.pop();
                    
                    pre.push(optr + preop1 + preop2);
                    
                    String postop2 = post.pop();
                    String postop1 = post.pop();
                    
                    post.push(postop1 + postop2 + optr);
                }
                st.pop();
            } else if (ch >= 'a' && ch <='z') {
                pre.push(ch + "");
                post.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(st.size() > 0 && precedence(st.peek()) >= precedence(ch)) {
                    String preop2 = pre.pop();
                    String preop1 = pre.pop();
                    char optr = st.pop();
                    
                    pre.push(optr + preop1 + preop2);
                    
                    String postop2 = post.pop();
                    String postop1 = post.pop();
                    
                    post.push(postop1 + postop2 + optr);
                }
                st.push(ch);
            }
        }
        
        while(st.size() > 0) {
            String preop2 = pre.pop();
            String preop1 = pre.pop();
            char optr = st.pop();

            pre.push(optr + preop1 + preop2);

            String postop2 = post.pop();
            String postop1 = post.pop();

            post.push(postop1 + postop2 + optr);
        }
        
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        infixConversions(exp);
    }
}
