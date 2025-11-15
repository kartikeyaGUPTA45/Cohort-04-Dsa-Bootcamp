// Problem Link: https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1

Code:
private static int lcs(String t1, String t2) {
        int m = t1.length();
        int n = t2.length();

        int curr[] = new int [n+1];
        int next[] = new int [n+1];

        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if (t1.charAt(i) == t2.charAt(j)) {
                    curr[j] = next[j+1] + 1;
                } else {
                    curr[j] = Math.max(curr[j+1], next[j]);
                }
            }

            next = curr.clone();
        }

        return curr[0];
    }
    
    public static int minSuperSeq(String s1, String s2) {
        // code here
        int x = lcs(s1,s2);
        
        return s1.length() + s2.length() - x;
        
    }
