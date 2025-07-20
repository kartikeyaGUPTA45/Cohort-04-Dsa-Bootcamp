import java.io.*;
import java.util.*;

public class Solution {
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
    
    public static void removePrime(ArrayList<Integer> arr) {
        int n = arr.size();
        
//         for(int i = n-1;i>=0;i--) {
//             int ele = arr.get(i);
            
//             if (isItPrime(ele)) {
//                 arr.remove(i);
//             }
//         }
        
        for(int i=0;i<arr.size();i++) {
            int ele = arr.get(i);
            if (isItPrime(ele)) {
                arr.remove(i);
                i-=1;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            int ele = scn.nextInt();
            arr.add(ele);
        }
        
        removePrime(arr);
        
        System.out.println(arr);
    }
}
