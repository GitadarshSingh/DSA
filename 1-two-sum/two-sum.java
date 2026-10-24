class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n= nums.length;
        int[] arr = new int[2];
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int sum = nums[i]+nums[j];

                if(sum==target){
                    arr[0]=j;
                    arr[1]=i;
                }
            }
        }
        return arr;
        
    }
}