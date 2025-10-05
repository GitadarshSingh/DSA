import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return helper(0, nums);
    }

    private List<List<Integer>> helper(int index, int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // base case: last element alone
        if (index == nums.length - 1) {
            List<Integer> single = new ArrayList<>();
            single.add(nums[index]);
            result.add(single);
            return result;
        }

        // get permutations of the rest
        List<List<Integer>> smaller = helper(index + 1, nums);

        // insert current element into every position
        for (List<Integer> perm : smaller) {
            for (int pos = 0; pos <= perm.size(); pos++) {
                List<Integer> newPerm = new ArrayList<>(perm);
                newPerm.add(pos, nums[index]);
                result.add(newPerm);
            }
        }
        return result;
    }
}
