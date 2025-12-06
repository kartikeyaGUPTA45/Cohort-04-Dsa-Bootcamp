import java.io.*;
import java.util.*;

public class Solution {
    
    private static void ngr(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        ans[n-1] = -1;
        
        st.push(arr[n-1]);
        
        for(int i = n-2;i>=0;i--) {
            while(st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        for(int i=0;i<n;i++) {
            System.out.println(ans[i]);
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
        
        ngr(arr, n);
    }
}
