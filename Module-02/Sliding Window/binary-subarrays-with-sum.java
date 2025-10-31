import java.io.*;
import java.util.*;

public class Solution {
    
    public static int subarraySum(int arr[], int n, int goal) {
        int sumArray[] = new int[n+1];
        sumArray[0] = 1;
        int sum = 0;
        int ans = 0;
        
        
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if (sum >= goal) {
                ans += (sumArray[sum-goal]);
            }
            sumArray[sum]+=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int goal = scn.nextInt();
        
        System.out.println(subarraySum(arr, n, goal));
    }
}
