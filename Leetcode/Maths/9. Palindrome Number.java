class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int reverseX = 0;

        while(temp > 0) {
            int rem = temp%10;
            reverseX = (reverseX*10 + rem);
            temp/=10;
        }

        if (x == reverseX) {
            return true;
        }

        return false;
    }
}
