class Solution {
    public int splitNum(int num) {
        char arr[] = String.valueOf(num).toCharArray();

        Arrays.sort(arr);

        int num1 = 0;
        int num2 = 0;

        for(int i =0;i<arr.length;i++) {
            if ((i&1) == 1) {
                num1 = num1*10 + (arr[i]-'0');
            } else {
                num2 = num2*10 + (arr[i]-'0');
            }
        }

        return num1 + num2;
    }
}
