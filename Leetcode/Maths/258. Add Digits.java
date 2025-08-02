class Solution {
    public int addDigits(int num) {
        int sum = 0;

        while(num > 0) {
            int rem = num%10;
            sum += rem;
            num/=10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;                
            }
            
        }

        return sum;
    }
}
