class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));

        if (s.length() == 1) {
            return ans.toString();
        }

        for(int i=1;i<s.length()-1;i++) {
            char ch = s.charAt(i);
            char chB = s.charAt(i-1);
            char chA = s.charAt(i+1);

            if ((ch == chA) && (ch == chB)) {} 
            else ans.append(ch);
        }

        ans.append(s.charAt(s.length()-1));
        return ans.toString();
    }
}
