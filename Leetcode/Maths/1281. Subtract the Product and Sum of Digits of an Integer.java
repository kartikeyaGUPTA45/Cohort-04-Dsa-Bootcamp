class Solution {
    public int subtractProductAndSum(int n) {
        int temp1 = n, temp2 = n;

        int sum = 0;
        int mul = 1;

        while(temp1 > 0) {
            sum += temp1%10;
            temp1/=10;
        }

        while(temp2 > 0) {
            mul *= (temp2%10);
            temp2 /=10;
        }

        return mul-sum;
    }
}
