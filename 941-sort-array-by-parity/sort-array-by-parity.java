class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;

        int start = 0 , end = n-1;

        while(start<end)
        {
            if(nums[start]%2 != 0 && nums[end]%2  == 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;

            }else if(nums[start]%2 == 0 && nums[end]%2 ==0)
            {
                start++;
            }else{
                end--;
            }

        }
        return nums;
    
    }
}