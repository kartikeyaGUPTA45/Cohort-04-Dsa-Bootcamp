import java.io.*;
import java.util.*;

public class Solution {
    
    public static void sieveOfEratosthenesOptimize(int n) {
        boolean arr[] = new boolean[n+1];
        
        for(int i=2;i<=n;i++) {
            arr[i] = true;
        }
        
        for(int i=2;i*i<=n;i++) {
            if (arr[i] == true) {
                for(int j=i*i;j<=n;j+=i) {
                    arr[j] = false;
                }
            }
        }
        
        for(int i=2;i<=n;i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        sieveOfEratosthenesOptimize(n);
    }
}
