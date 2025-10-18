class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-3;i++) {
            for(int j=i+1;j<n-2;j++) {
                int left = j+1;
                int right = n-1;

                long sum = (long)target - nums[i] - nums[j]; 
                while(left < right) {
                    long tempSum = nums[left] + nums[right];
                    // sum += ()
                    if (tempSum == sum) {
                        List<Integer> subAns = new ArrayList<>();
                        subAns.add(nums[i]);
                        subAns.add(nums[j]);
                        subAns.add(nums[left]);
                        subAns.add(nums[right]);

                        ans.add(subAns);

                        while(left<right && nums[left] == nums[left+1]) {
                            left++;
                        }

                        while(left<right && nums[right] == nums[right-1]) {
                            right--;
                        } 

                        left++;
                        right--;

                    } else if (tempSum > sum) {
                        right--;
                    } else {
                        left++;
                    }
                }

                while(j < n-2 && nums[j] == nums[j+1]) {
                    j++;
                }
            }

            while(i < n-3 && nums[i] == nums[i+1]) {
                i++;
            }
        }

        return ans;
    }
}
