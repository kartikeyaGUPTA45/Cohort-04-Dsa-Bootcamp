// Link:  https://www.geeksforgeeks.org/problems/greatest-of-three--154612/1?page=6&category=Java,Functions&sortBy=submissions

Code: 

import java.util.*;

public class Solution {
    public static int greatestOfThree(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > c) return b;
        return c;
    }
    
    public static void main(String args[]) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        System.out.println(greatestOfThree(a,b,c));
    }
}


