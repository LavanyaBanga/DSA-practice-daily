class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>(); 
        findCombo(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombo(int index, int[] nums, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index == nums.length) {
            return;
        }
        current.add(nums[index]);
        findCombo(index, nums, target - nums[index], current, ans);
        current.remove(current.size() - 1);
        findCombo(index + 1, nums, target, current, ans);
    }
}
