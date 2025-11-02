// Problem Link: https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1


class Solution {

    int search(String pat, String txt) {
        // code here
        if (pat.length() > txt.length()) {
            return 0;
        }
        
        int txtFreq[] = new int[26];
        int patFreq[] = new int[26];
        
        for(int i=0;i<pat.length();i++) {
            patFreq[pat.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<pat.length();i++) {
            txtFreq[txt.charAt(i)-'a']+=1;
        }
        
        int ans = 0;
        
        if (Arrays.equals(txtFreq, patFreq)) {
            ans += 1;
        }
        
        int i=pat.length(), j = 0;
        
        while(i < txt.length()) {
            txtFreq[txt.charAt(i)-'a']+=1;
            txtFreq[txt.charAt(j)-'a']-=1;
            
            if (Arrays.equals(txtFreq, patFreq)) {
                ans += 1;
            }
            
            i++;
            j++;
        }
        
        return ans;
    }
}
