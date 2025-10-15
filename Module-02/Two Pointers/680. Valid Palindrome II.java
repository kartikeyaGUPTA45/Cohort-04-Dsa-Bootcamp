class Solution {

    public boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;

        while(i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1)) {
                    return true;
                }
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
