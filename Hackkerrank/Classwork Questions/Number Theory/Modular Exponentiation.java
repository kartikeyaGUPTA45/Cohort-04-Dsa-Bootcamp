import java.io.*;
import java.util.*;

public class Solution {
    
    public static int modularExponentiation(int x, int n, int M) {
        int ans = 1;
        
        while(n > 0) {
            if (n%2 == 1) {
                ans = (ans*x)%M;
                n = n-1;
            } else {
                x = (x*x)%M;
                n = n/2;
            }
        }
        
        return ans%M;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int M = scn.nextInt();
        
        System.out.println(modularExponentiation(x,n,M));
    }
}
