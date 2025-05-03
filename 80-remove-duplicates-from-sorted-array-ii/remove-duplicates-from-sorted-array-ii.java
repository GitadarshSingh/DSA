class Solution {
    public int removeDuplicates(int[] nums) {
       int n = nums.length;
          int start = 2;
       for(int i = 2 ; i< n ;i++ )
       {
        if(nums[i] != nums[start-2]) 
        {
        nums[start] = nums[i];
        start++;
        }

       }
        
    return start;
    }

}