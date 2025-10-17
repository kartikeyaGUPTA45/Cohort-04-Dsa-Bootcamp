class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch); // Let's
            } else {
                sb.reverse(); // s'teL
                ans.append(sb); // s'teL_ekat_edoCteeL_
                ans.append(" ");
                sb = new StringBuilder();
            }
        }

        sb.reverse();
        ans.append(sb);
        return ans.toString();
    }
}
