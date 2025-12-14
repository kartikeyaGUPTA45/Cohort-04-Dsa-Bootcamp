import java.io.*;
import java.util.*;

public class Solution {
    
    private static void kLargestElements(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // minHeap
        
        for(int i=0;i<n;i++) {
            pq.add(arr[i]);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        while(pq.size() > 0) {
            System.out.println(pq.poll());
        }
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        kLargestElements(arr, n, k);
    }
}
