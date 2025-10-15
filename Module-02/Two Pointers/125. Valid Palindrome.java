class Solution {

    public boolean isUpperCase(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }

    public boolean isLowerCase(char ch) {
        return (ch >= 'a' && ch <= 'z');
    }

    public boolean isDigit(char ch) {
        return (ch >= '0' && ch <='9');
    }

    public String removeAllNonAlphaNumeric(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if (isUpperCase(ch)) {
                char c = (char)(ch-'A'+'a');
                sb.append(c);
            } else if (isLowerCase(ch)) {
                sb.append(ch);
            } else if (isDigit(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public boolean isAPalindrome(String s) {
        int i = 0, j = s.length()-1;

        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        } 

        return true;
    }

    public boolean isPalindrome(String s) {
        String updatedString = removeAllNonAlphaNumeric(s);
        return isAPalindrome(updatedString);
    }
}
