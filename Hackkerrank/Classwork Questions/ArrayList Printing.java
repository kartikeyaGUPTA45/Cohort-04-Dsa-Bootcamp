import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printArrayList(ArrayList<Integer> arr) {
        int n = arr.size();
        
        for(int i=0;i<n;i++) {
            int ele = arr.get(i);
            System.out.print(ele + " ");
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
        
        printArrayList(arr);
    }
}
