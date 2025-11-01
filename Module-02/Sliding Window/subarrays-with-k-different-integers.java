import java.io.*;
import java.util.*;

public class Solution {
    
    public static int atmost(int nums[], int k) {
        int n = nums.length;
        int i = 0, j = 0, ans = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(i < n) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            while(map.size() > k) {
                if (map.get(nums[j]) == 1) {
                    map.remove(nums[j]);
                } else {
                    map.put(nums[j], map.get(nums[j])-1);
                }
                j++;
            }

            ans += (i-j+1);
            i++;
        }
        return ans;
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
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
        System.out.println(subarraysWithKDistinct(nums, k));
    }
}
