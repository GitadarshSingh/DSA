class Solution {
    public int pivotIndex(int[] nums) {

        int rigthSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            rigthSum = rigthSum+nums[i];
        }

        int leftSum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            rigthSum=rigthSum - nums[i];

            if(leftSum==rigthSum) return i;

            leftSum = leftSum+nums[i];
        }
        return -1;
        
    }
}