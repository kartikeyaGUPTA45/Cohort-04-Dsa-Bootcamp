class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n-2;i++) {
            int j = i+1;
            int k = n-1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    List<Integer> subAns = new ArrayList<>();
                    subAns.add(nums[i]);
                    subAns.add(nums[j]);
                    subAns.add(nums[k]);

                    ans.add(subAns);

                    // removing the duplicate triplets
                    while(j < k && nums[j] == nums[j+1]) {
                        j++;
                    }

                    while(j < k && nums[k] == nums[k-1]) {
                        k--;
                    }


                    j++;
                    k--;

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }

            while(i < n-2 && nums[i] == nums[i+1]) {
                i++;
            }
        }

        return ans;
    }
}
