import java.io.*;
import java.util.*;

public class Solution {
    
    public static int atmost(int nums[], int k) {
        int ans = 0;
        int n = nums.length;
        int i = 0, j = 0, oddCount = 0;
        
        while(i < n) {
            if ((nums[i]&1) == 1) oddCount+=1;
            
            while(oddCount > k) {
                if ((nums[j]&1) == 1) oddCount-=1;
                j++;
            }
            
            ans += (i-j+1);
            i++;
        }
        
        return ans;
        
    }
    
    public static int niceSubArrays(int nums[], int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        
        for(int i=0;i<n;i++) {
            nums[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        System.out.println(niceSubArrays(nums, k));
    }
}
