//Link: https://www.geeksforgeeks.org/problems/counting-sort/1?utm_source=chatgpt.com

class Solution {
    
    public static char[] countSort(char arr[], int n) {
        // Step - 01
        
        
        //Step-02
        int range = 26;
        
        // Step-03 
        int count[] = new int[range];
        
        // Step-04 
        for(char ele: arr) {
            int idx = ele - 'a';
            count[idx]+=1;
        }
        
        //Step-05
        for(int i=1;i<range;i++) {
            count[i] += count[i-1];
        }
        
        // Step-06
        char ans[] = new char[n];
        for(int i=n-1;i>=0;i--) {
            char val = arr[i];
            ans[count[val-'a']-1] = val;
            count[val-'a']-=1;
        }
        
        return ans;
        
    }
    
    public static String countSort(String s) {
        // code here
        char arr[] = s.toCharArray();
        arr = countSort(arr, s.length());
        StringBuilder sb = new StringBuilder();
        for(char ch : arr) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
