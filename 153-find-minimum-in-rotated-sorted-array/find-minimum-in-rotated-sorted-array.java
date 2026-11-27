class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=0;

        while(low<=high)
        {
            int mid = (high+low)/2;

            if(nums[mid]>nums[nums.length-1])
            {
                low=mid+1;
            }
            else
            {
                ans = nums[mid];
                high=mid-1;
            }
        }
        return ans;
        
    }
}