
class Solution {
    public int getLucky(String s, int k) {
        String num = "";

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            num += ((ch-'a'+1)+"");
        } 

        // zbax -> 262124  => 2 + 6 + 2 + 1 + 2 + 4 => 17
        int ans = 0;
        for(int i=1;i<=k;i++) {
            ans = 0;
            for(int j=0;j<num.length();j++) {
                char ch = num.charAt(j);
                int d = ch-'0';
                ans += d;
            }
            num = ans + "";
        }

        return ans;
    }
}
