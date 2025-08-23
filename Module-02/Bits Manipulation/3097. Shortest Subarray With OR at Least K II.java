class Solution {

    public void updateFreq(int num, int freq[], int val) {
        for(int i=0;i<32;i++) {
            if (((num>>i)&1) == 1) {
                freq[i] += val;
            }
        }
    }

    public int binaryToDecimal(int freq[]) {
        int ans = 0;

        for(int i=0;i<32;i++) {
            if (freq[i] > 0) {
                ans |= (1<<i); // set the bit
            }
        }

        return ans;
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int i = 0; // acquire the element
        int j = 0; // release the element
        int ans = Integer.MAX_VALUE; // For storing minimum length

        int freq[] = new int[32]; // store an integer

        while(i< nums.length) {
            updateFreq(nums[i], freq, 1);
            while(j <= i && binaryToDecimal(freq) >= k) {
                ans = Math.min(ans, i-j+1);
                updateFreq(nums[j],freq,-1);
                j+=1;
            }
            i+=1;
        }

        return (ans == Integer.MAX_VALUE)? -1 : ans;
    }
}

