// Link: https://www.geeksforgeeks.org/problems/calculator/1?page=2&category=Java,Functions&sortBy=submissions

Code:

// User function Template for Java
class Solution {
    public static void utility(int a, int b, int operator) {

        // write your code here
        if (operator == 1) {
            int c = a+b;
            System.out.print(c+"");
        }    
        else if (operator == 2) {
            int c = a-b;
            System.out.print(c+"");
        }
        else if (operator == 3) {
            int c = a*b;
            System.out.print(c+"");
        }
        else System.out.print("Invalid Input");
    }
}

