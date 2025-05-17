class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = start + 1;

        while(end < n){
            if(nums[start]==0 && nums[end] != 0){
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end] = temp;
                start++;
            }else if(nums[start] == 0 && nums[end]==0){
                end++;
             }else {
               start++;
                if(end <= start) end = start + 1;
            }
    
        }
    }
}