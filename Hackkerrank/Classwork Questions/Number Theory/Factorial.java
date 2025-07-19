import java.io.*;
import java.util.*;

public class Solution {
    
    public static int factorial(int n) {
        int ans = 1;
        
        for(int i=2;i<=n;i++) {
            ans *= i;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(factorial(n));
    }
}
