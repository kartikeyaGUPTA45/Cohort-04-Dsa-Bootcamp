import java.io.*;
import java.util.*;

public class Solution {
    
    public static int countOfFactors(int n) {
        int count = 0;
        
        for(int i=1;i*i<=n;i++) {
            if (n%i == 0) {
                if (i == n/i) count+=1;
                else count+=2;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(countOfFactors(n));
    }
}
