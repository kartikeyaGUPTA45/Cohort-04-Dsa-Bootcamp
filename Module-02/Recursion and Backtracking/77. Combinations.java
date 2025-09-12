class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>subAns = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(1,n,k,ans, subAns);

        return ans;
    }

    public void helper(int ele, int n, int k, List<List<Integer>> ans, List<Integer> subAns) {
        if (subAns.size() == k) {
            ans.add(new ArrayList<>(subAns));
            return;
        }

        for(int i = ele;i<=n;i++) {
            subAns.add(i);
            helper(i+1, n,k,ans,subAns);
            subAns.remove(subAns.size()-1);
        }
    }
}
