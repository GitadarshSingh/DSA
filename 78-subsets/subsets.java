
class Solution {
    static List<List<Integer>> arr;

    public void helper(int i, int[] nums, ArrayList<Integer> ans) {
        if (i == nums.length) {
            arr.add(new ArrayList<>(ans)); // create a copy of ans
            return;
        }

        // not take
        helper(i + 1, nums, ans);

        // take
        ans.add(nums[i]);
        helper(i + 1, nums, ans);
        ans.remove(ans.size() - 1); // backtrack
    }

    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        helper(0, nums, new ArrayList<>());
        return arr;
    }
}
