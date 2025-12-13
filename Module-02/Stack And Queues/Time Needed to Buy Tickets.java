import java.io.*;
import java.util.*;

public class Solution {
    
    private static int timeTaken(int arr[], int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<n;i++) {
            q.add(i);
        }
        
        int t = 0;
        while(true) {
            int idx = q.poll();
            arr[idx]-=1;
            t+=1;
            if (idx == k && arr[idx] == 0) {
                break;
            }
            
            if (arr[idx] != 0) {
                q.add(idx);
            }
        }
        
        return t;
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
        System.out.println(timeTaken(arr, n, k));
    }
}
