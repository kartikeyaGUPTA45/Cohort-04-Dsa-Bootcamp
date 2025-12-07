import java.io.*;
import java.util.*;

public class Solution {
    
    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else return 0;
    }
    
    private static int calculate(int op1, int op2, char ch) {
        if (ch == '+') return op1 + op2;
        else if (ch == '-') return op1 - op2;
        else if (ch == '/') return op1 / op2;
        else return op1 * op2;
    }

    private static int infixEvaluation(String exp) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                st1.push(ch-'0');
            } else if (ch == '(') {
                st2.push(ch);
            } else if (ch == ')') {
                while(st2.peek() != '(') {
                    int op2 = st1.pop();
                    int op1 = st1.pop();
                    int ans = calculate(op1, op2, st2.pop());
                    st1.push(ans);    
                }
                st2.pop();
                
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(st2.size() > 0 && precedence(st2.peek()) >= precedence(ch)) {
                    int op2 = st1.pop();
                    int op1 = st1.pop();
                    int ans = calculate(op1, op2, st2.pop());
                    st1.push(ans);        
                } 
                
                st2.push(ch);
            }
        }
        
        while(st2.size() > 0) {
            int op2 = st1.pop();
            int op1 = st1.pop();
            int ans = calculate(op1, op2, st2.pop());
            st1.push(ans);  
        }
        
        return st1.pop();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        
        System.out.println(infixEvaluation(exp));
    }
}
