import java.io.*;
import java.util.*;

public class Solution {
    
    private static int evaluate(int op1, int op2, char ch) {
        if (ch == '+') return op1 + op2;
        else if (ch == '-') return op1 - op2;
        else if (ch == '*') return op1 * op2;
        else return op1/op2;
    }
    
    private static void postFixEvaluationAndConversion(String exp) {
        Stack<Integer> st1 = new Stack<>(); // Ans
        Stack<String> st2 = new Stack<>(); // Infix
        Stack<String> st3 = new Stack<>(); // Prefix
        
        
        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            
            
            if (ch >= '0' && ch <= '9') {
                st1.push(ch-'0');
                st2.push(ch+"");
                st3.push(ch+"");
            } else {
                int opr2 = st1.pop();
                int opr1 = st1.pop();
                
                st1.push(evaluate(opr1, opr2, ch));
                
                String oprr2 = st2.pop();
                String oprr1 = st2.pop();
                
                st2.push("(" + oprr1 + ch + oprr2 + ")");
                
                
                oprr2 = st3.pop();
                oprr1 = st3.pop();
                
                st3.push(ch + oprr1 + oprr2);
            }
        }
        
        System.out.println(st1.pop());
        System.out.println(st2.pop());
        System.out.println(st3.pop());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        
        postFixEvaluationAndConversion(exp);
    }
}
