import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isItPrime2(int n) {
        if (n == 1) return false;
        
        for(int i=2;i*i<=n;i++) {
            if (n%i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isItPrime(int n) {
        int count = 0;
        
        for(int i=1;i*i<=n;i++) {
            if (n%i == 0) {
                if (i == n/i) count+=1;
                else count+=2;
            }
        }
        
        if (count == 2) return true;
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(isItPrime2(n));
    }
}
