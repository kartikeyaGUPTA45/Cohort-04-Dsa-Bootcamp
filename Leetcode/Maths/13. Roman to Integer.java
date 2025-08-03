class Solution {
    private int romanSymbolToInteger(char ch) {
        if (ch == 'I') return 1;
        else if (ch == 'V') return 5;
        else if (ch == 'X') return 10;
        else if (ch == 'L') return 50;
        else if (ch == 'C') return 100;
        else if (ch == 'D') return 500;
        return 1000;
    }

    public int romanToInt(String s) {
        int ans = 0;

        for(int i=s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            int val = romanSymbolToInteger(ch);

            if (4*val < ans) {
                ans -= val;
            } else {
                ans += val;
            }
        }

        return ans;
    }
}
