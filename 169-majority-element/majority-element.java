class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[n/2];

        return mid;
        
    }
}