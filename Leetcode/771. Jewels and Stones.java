class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i=0;i<J.length();i++) {
            char ch1 = J.charAt(i);
            for(int j=0;j<S.length();j++) {
                char ch2 = S.charAt(j);

                if (ch1 == ch2) {
                    count+=1;
                }
            }
        }

        return count;
    }
}
