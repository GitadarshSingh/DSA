class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum  = nums[0];
        int minSum = nums[0];

        int ans = Math.abs(nums[0]);

        for(int i=1;i<nums.length;i++)
        {
            int v1 = maxSum+nums[i];
            int v2 = nums[i];

            maxSum=Math.max(v1,v2);

            int v3 = minSum+nums[i];
            
            minSum = Math.min(v3,v2);

            ans= Math.max(ans,Math.max(Math.abs(maxSum),Math.abs(minSum)));


        }
        return ans;
        
    }
}