import java.io.*;
import java.util.*;

public class Solution {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
    
    public static int inverseModulo(int n, int m) {
        int g = gcd(n,m);
        
        if (g != 1 && m <= 1) {
            return -1;
        }
        
        for(int i=1;i<m;i++) {
            int val = (n%m * i)%m;
            
            if (val == 1) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(inverseModulo(n,m));
    }
}
