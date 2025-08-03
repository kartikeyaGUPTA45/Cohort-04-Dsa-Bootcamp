class Solution {
    public String convertToTitle(int cN) {
        StringBuilder sb = new StringBuilder();

        while(cN > 0) {
            int rem = cN%26;
            if (rem == 0) {
                sb.append("Z");
                cN-=1;
            } else {
                sb.append((char)('A'+rem-1));
            }

            cN/=26;
        }

        return sb.reverse().toString();
    }
}
