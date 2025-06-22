
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char updatedCh = (char)(ch-'A'+'a');
                str+=updatedCh;
            } else if (ch >= 'a' && ch <= 'z') {
                str += ch;
            } else if (ch >= '0' && ch <= '9') {
                str += ch;
            }
        }

        int i = 0, j = str.length()-1;

        while(i<j) {
            char chI = str.charAt(i);
            char chJ = str.charAt(j);

            if (chI != chJ) return false;

            i++;
            j--;
        }

        return true;
    }
}
