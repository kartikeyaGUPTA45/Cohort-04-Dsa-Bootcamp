class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subAns = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(0, nums, ans, subAns);

        return ans; 
    }

    public void helper(int idx, int arr[], List<List<Integer>> ans, List<Integer> subAns) {

        if (idx == arr.length) {
            ans.add(new ArrayList<>(subAns));
            return;
        }

        subAns.add(arr[idx]);
        helper(idx+1, arr, ans, subAns);
        subAns.remove(subAns.size()-1);
        helper(idx+1, arr, ans, subAns);
    }
}
