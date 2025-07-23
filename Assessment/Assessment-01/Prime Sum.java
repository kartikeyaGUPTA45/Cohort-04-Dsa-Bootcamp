import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        
        for(int i=2;i*i<=n;i++) {
            if (n%i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static int primeSum(int N) {
        if (N < 2) return 0;
        int ans = 0;
        for(int i=2;i<=N;i++) {
            if (isPrime(i)) {
                ans += i;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  N = scn.nextInt();
        System.out.println(primeSum(N));
    }
}
