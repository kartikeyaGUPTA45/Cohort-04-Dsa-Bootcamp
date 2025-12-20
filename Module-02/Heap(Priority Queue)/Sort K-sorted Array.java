import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[] sortKSortedArray(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int idx = 0;
        int ans[] = new int [n];
        
        for(int i=0;i<n;i++) {
            pq.add(arr[i]);
            
            if (pq.size() > k) {
                int ele = pq.poll();
                ans[idx] = ele;
                idx+=1;
            }
        }
        
        while(pq.size() > 0) {
            ans[idx] = pq.poll();
            idx+=1;
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
        
        int k = scn.nextInt();
        arr = sortKSortedArray(arr, n, k);
        
        for(int ele: arr) {
            System.out.println(ele);
        }
        
    }
}
