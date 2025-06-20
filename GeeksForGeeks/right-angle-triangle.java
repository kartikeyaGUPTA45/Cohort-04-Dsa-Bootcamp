// Link: https://www.geeksforgeeks.org/problems/right-angle-triangle-1605685807/1?page=4&category=Java,Functions&sortBy=submissions

Code:
// User function Template for Java
class Solution {
    public static void triangleWall(int n) {

        // Write your code here
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


