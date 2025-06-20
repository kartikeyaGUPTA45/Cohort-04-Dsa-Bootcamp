// Link: https://www.geeksforgeeks.org/problems/java-reverse-a-string0416/1?page=1&category=Java,Functions&sortBy=submissions

Code:
class Solution {
    static String revStr(String s) {
        // code here
        String ans = "";
        for(int i=s.length()-1;i>=0;i--) {
            ans += s.charAt(i);
        }
        
        return ans;
    }
}
