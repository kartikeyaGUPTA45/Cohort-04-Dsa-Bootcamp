import java.io.*;
import java.util.*;

public class Solution {
    
    public static int countEvenDigits(int N) {
        int ans = 0;
        while(N > 0) {
            int rem = N%10;
            if(rem %2 == 0) {
                ans+=1;
            }
            
            N = N/10;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        
        System.out.println(countEvenDigits(N));
    }
}
