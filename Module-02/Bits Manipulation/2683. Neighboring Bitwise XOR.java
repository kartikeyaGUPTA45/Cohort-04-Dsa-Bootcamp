
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        for(int i=0;i<derived.length;i++) {
            ans ^= derived[i];
        }

        return (ans == 0);
    }
}
