import java.io.*;
import java.util.*;

public class Solution {
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        if (a < 0) a = a*(-1);
        if (b < 0) b = b*(-1);
        
        System.out.println(gcd(a,b));
    }
}
