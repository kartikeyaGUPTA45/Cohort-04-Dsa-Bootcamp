class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0, i = a.length()-1, j = b.length()-1;

        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = (i >= 0) ? a.charAt(i)-'0' : 0;
            sum += (j >= 0) ? b.charAt(j)-'0' : 0;
            sum += carry;

            int rem = sum%2;
            ans = (rem +"") + ans;
            carry = sum/2;

            i--;
            j--;
        }

        return ans;
    }
}
