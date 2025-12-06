import java.io.*;
import java.util.*;

public class Solution {
    
    private static void ngl(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.println(-1);
        for(int i=1;i<n;i++) {
            while(st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            
            if (st.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(st.peek());
            } 
            
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        ngl(arr, n);
    }
}
