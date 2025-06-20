// Link: https://www.geeksforgeeks.org/problems/the-fizzbuzz-program/1?page=1&category=Java,Functions&sortBy=submissions

Code:
// User function Template for Java
class Solution {
    public static void fizzBuzz(int n) {
        // Write your code here.
        String ans = "";
        
        if (n%3 == 0) ans += "Fizz";
        if (n%5 == 0) ans += "Buzz";
        if (ans.equals("")) ans = n+"";
        
        System.out.println(ans);
    }
}
