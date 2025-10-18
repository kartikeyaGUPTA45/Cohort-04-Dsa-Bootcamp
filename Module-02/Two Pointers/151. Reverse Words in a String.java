class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");

        int left = 0;
        int right = arr.length-1;
        

        while(left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        

        StringBuilder sb = new StringBuilder();

        for(String str : arr) {
            sb.append(str);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }
}
